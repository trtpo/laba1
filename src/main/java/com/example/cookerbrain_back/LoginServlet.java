package com.example.cookerbrain_back;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected HttpServletRequest req;
    protected HttpServletResponse resp;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.req = req;
        this.resp = resp;
        this.requestManager();
    }

    protected void requestManager() throws IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Logger logger = Logger.getLogger(getClass().getName());
        logger.info("Начало обработки POST-запроса");


        try {
            // Загрузка драйвера
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Установление соединения с БД
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cookerbrain",
                    "root",
                    "1111"
            );

            // Получение данных из HTML-формы
            String login = request.getParameter("login");
            String password = request.getParameter("password");

            logger.info("Login: " + login);
            logger.info("Password: " + password);


            // Выполнение запроса к БД для проверки пользователя
            String selectQuery = "SELECT * FROM cookerbrain.users WHERE login = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
                preparedStatement.setString(1, login);
                preparedStatement.setString(2, password);

                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    // Пользователь найден
                    out.println("Login successful!<script>window.location.href='http://localhost:8080/index.html';</script>");
                } else {
                    // Неверные учетные данные
                    out.println("Invalid login or password");
                }


            }

            // Закрытие соединения с БД
            connection.close();
        } catch (Exception e) {
            logger.severe("An error occurred during login: " + e.getMessage());
            e.printStackTrace();  // Вывод стека вызовов в консоль
            out.println("An error occurred during login. Please try again later.");
        }


    }
}
