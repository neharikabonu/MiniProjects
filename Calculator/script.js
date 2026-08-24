const display = document.getElementById("display");
const buttons = document.querySelector(".buttons");
const decimal = document.querySelector(".decimal");
const equals = document.querySelector(".equals");
const allClear = document.querySelector(".clear");
const deleteBtn = document.querySelector(".delete");
const percentage = document.querySelector(".percentage");
let isResultDisplayed = false;

let firstNumber = "";
let operator = "";

buttons.addEventListener("click", (event) => {
  if (event.target.classList.contains("number")) {
    
    if(isResultDisplayed) {
      display.value = "";
      isResultDisplayed = false;
    }

    display.value += event.target.textContent;
  }

  if (event.target.classList.contains("operator")) {

    if(display.value === "Error") {
      return;
    }

    const newOperator = event.target.textContent;

    if (operator !== "") {
      const secondNumber = Number(display.value);
      const result = calculate(firstNumber, secondNumber, operator);
      display.value = result;
      firstNumber = result;

    } else {
      firstNumber = Number(display.value);
    }

    operator = newOperator;

    display.value = "";
    isResultDisplayed = false;
  }
})

decimal.addEventListener("click", () => {

  if (isResultDisplayed) {
    display.value = "";
    isResultDisplayed = false;
  }

  if (!display.value.includes(".")) {
    display.value += ".";
  }
})

equals.addEventListener("click", () => {
  if (operator === "" || display.value === "") {
    return;
  }

  const secondNumber = Number(display.value);

  const result = calculate(firstNumber, secondNumber, operator);

  display.value = result;

  firstNumber = result;

  operator = "";

  isResultDisplayed = true;
})

function calculate(firstNumber, secondNumber, operator) {
  switch (operator) {
    case "+": return firstNumber + secondNumber;

    case "-": return firstNumber - secondNumber;

    case "×": return firstNumber * secondNumber;

    case "÷": 
    if (secondNumber === 0) return "Error"; 
    return firstNumber / secondNumber;

    default: return null;
  }
}

allClear.addEventListener("click", () => {
  display.value = "";
  firstNumber = "";
  operator = "";
  isResultDisplayed = false;
})

deleteBtn.addEventListener("click", () => {
  const content = display.value;
  display.value = content.slice(0, -1);
})

percentage.addEventListener("click", () => {

  if (display.value === "" || display.value === "Error") {
    return;
  }

  const currentNumber = Number(display.value);

  if (operator === "+" || operator === "-") {
    display.value = firstNumber * (currentNumber / 100);
  }

  else if (operator === "×" || operator === "÷") {
    display.value = currentNumber / 100;
  }

  else {
    display.value = currentNumber / 100;
  }

});

document.addEventListener("keydown", (event) => {

  const key = event.key;

  // Numbers
  if (key >= "0" && key <= "9") {

    const numberButtons = document.querySelectorAll(".number");

    numberButtons.forEach((button) => {
      if (button.textContent === key) {
        button.click();
      }
    });

  }

  // Decimal
  else if (key === ".") {
    decimal.click();
  }

  // Operators
  else if (key === "+") {
    document.querySelector(".add").click();
  }

  else if (key === "-") {
    document.querySelector(".subtract").click();
  }

  else if (key === "*" || key.toLowerCase() === "x") {
    document.querySelector(".multiply").click();
  }

  else if (key === "/") {
    document.querySelector(".divide").click();
  }

  // Percentage
  else if (key === "%") {
    percentage.click();
  }

  // Equals
  else if (key === "Enter" || key === "=") {
    equals.click();
  }

  // Delete
  else if (key === "Backspace") {
    deleteBtn.click();
  }

  // AC
  else if (key === "Escape") {
    allClear.click();
  }

});