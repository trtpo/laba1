package com.example.cookerbrain_back;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet2", urlPatterns = { "/LoginServlet2" })
public class LoginServlet2 extends HttpServlet {
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
        // Implement your request handling logic here
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Logger logger = Logger.getLogger(getClass().getName());
        logger.info("Начало обработки POST-запроса");

        Connection connection = null;

        try {
            // Загрузка драйвера
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Установление соединения с БД
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cookerbrain", "root", "1111");

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

                if (!resultSet.next()) {
                    // User does not exist, insert a new user
                    String insertQuery = "INSERT INTO cookerbrain.users (login, password) VALUES (?, ?)";
                    try (PreparedStatement insertStatement = connection.prepareStatement(insertQuery)) {
                        insertStatement.setString(1, login);
                        insertStatement.setString(2, password);
                        int rowsAffected = insertStatement.executeUpdate();

                        if (rowsAffected > 0) {
                            out.println("Login successful!<script>window.location.href='http://localhost:8080/index.html';</script>");
                        } else {
                            out.println("Failed to add new user.");
                        }
                    }
                } else {
                    out.println("User already exists!");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            logger.severe("An error occurred during login: " + e.getMessage());
            e.printStackTrace(); // Вывод стека вызовов в консоль
            out.println("An error occurred during login. Please try again later.");
        } finally {
            try {
                // Закрытие соединения с БД в блоке finally
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                logger.severe("An error occurred while closing the database connection: " + ex.getMessage());
            }
        }
    }
}
