function mifflinsFornula(gender, age, bodyFat, height, weight) {
    // alert('working 1');
    let bmr = (10*weight) + (6.25*height) - (5*age) + 5;
    if(gender == 'Female')
    {
        bmr = (10*weight) + (6.25*height) - (5*age) - 161;
    }

    return bmr;
}

function harrisFornula(gender, age, bodyFat, height, weight) {
    // alert('working 2');
    let bmr = (13.397*weight) + (4.799*height) - (5.677*age) + 88.362;
    if(gender == 'Female') // Female
    {
        bmr = (9.247*weight) + (3.098*height) - (4.330*age) + 447.593;
    }

    return bmr;
}

function katchsFornula(bodyFat, weight) {
    // alert('working 3');
    let bmr = 370 + 21.6*(1 - (bodyFat/100))*weight;

    return bmr;
}


const calculateBtn = document.querySelector('.btn');




calculateBtn.addEventListener('click', function () {
    // alert('working ...');

    const age = document.querySelector('#age').value;
    const gender = document.querySelector('input[name="gender"]:checked').value;

    console.log(gender);

    const bodyFat = document.querySelector('#body-fat').value;
    const height = document.querySelector('#height').value;
    const weight = document.querySelector('#weight').value;
    
    var activity = document.querySelector('#activity');
    var activityOptionChose = activity.options[activity.selectedIndex].value;
    
    var formula = document.querySelector('#formula');
    var formulaOptionChose = formula.options[formula.selectedIndex].value;
    
    let bmr = '';


    // console.log(formulaOptionChose);

    if (formulaOptionChose == 1) {
        bmr = mifflinsFornula(gender, age, bodyFat, height, weight);
        
    }
    else if(formulaOptionChose == 2) {
        bmr = harrisFornula(gender, age, bodyFat, height, weight);
        // alert('2');
    }
    else if(formulaOptionChose == 3 ) {
        bmr = katchsFornula(bodyFat, weight);
        // alert('3');
        // console.log(bmr);
    }    

    // console.log(bmr);

    let res = parseFloat(bmr) * parseFloat(activityOptionChose);

    console.log(res);

    document.querySelector('.ans').innerHTML = `You should consume ${Math.ceil(res)} calories to maintain your weight.`;
    
   
});

