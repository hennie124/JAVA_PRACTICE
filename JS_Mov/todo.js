const toDoForm = document.getElementById("to-do form");
const toDoInput = toDoForm.querySelector("input");
const toDoList = document.getElementById("to-do list");

function handleToDoSubmit(event){
    event.preventDefault();
    console.log(toDoForm.value);
    const newTodo = toDoInput.value;
    toDoInput.value = "";
    console.log(newTodo,toDoInput.value);
    }

toDoForm.addEventListener("submit", handleToDoSubmit);