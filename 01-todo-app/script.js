const taskInput = document.getElementById("task");

const taskList = document.getElementById("taskList");

const addBtn = document.getElementById("addBtn");

const taskCount = document.getElementById("taskCount");

const clearBtn = document.getElementById("clearBtn");

const tasks = JSON.parse(localStorage.getItem("tasks")) || [];

function updateTaskCount() {
  taskCount.textContent = `Total tasks: ${tasks.length}`;
}

function createTask(task) {
  const li = document.createElement("li");
  const name = document.createElement("span");
  const deleteBtn = document.createElement("button");
  deleteBtn.textContent = "Delete";
  const doneBtn = document.createElement("button");
  doneBtn.textContent = "Done";
  const editBtn = document.createElement("button");
  editBtn.textContent = "Edit";


  //delete button logic here
  deleteBtn.addEventListener('click', () => {
    console.log("delete");
    const index = tasks.indexOf(task);
    tasks.splice(index, 1);
    localStorage.setItem("tasks", JSON.stringify(tasks));

    updateTaskCount();

    li.remove();
  });

  //done button logic here
  doneBtn.addEventListener('click', () => {
    name.classList.toggle("completed");
    if (name.classList.contains("completed")) {
      doneBtn.textContent = "Undo";
    } else {
      doneBtn.textContent = "Done";
    }
    
  });

  editBtn.addEventListener('click', () => {
    let value = prompt("Enter new task: ");
    if (value === null) return;
    let newName = value.trim();
    if (newName === "") return;

    name.textContent = newName;
  })

  const actions = document.createElement("div");

  actions.append(editBtn);
  actions.append(doneBtn);
  actions.append(deleteBtn);

  name.textContent = task;
  li.append(name);
  li.append(actions);

  taskList.append(li);
}

for (let task of tasks) {
  createTask(task);
}
updateTaskCount();

addBtn.addEventListener('click', () => {
  let task = taskInput.value.trim();

  if (task === "") return;

  //creating of new task along with delete, done, edit button
  createTask(task);

  tasks.push(task);

  localStorage.setItem("tasks", JSON.stringify(tasks));

  updateTaskCount();

  taskInput.value = "";

  taskInput.focus();
})

taskInput.addEventListener("keydown", (event) => {
  if(event.key === "Enter") {
    addBtn.click();
  }
})

clearBtn.addEventListener("click", () => {
  taskList.innerHTML = "";
  tasks.length = 0;
  localStorage.removeItem("tasks");
  updateTaskCount();
});

