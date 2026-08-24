#  My Todo List 📝

A simple and responsive **Todo List web application** built using **HTML, CSS, and JavaScript**.

This project allows users to create, manage, edit, complete, and delete tasks. Tasks are stored in the browser using **Local Storage**, so they remain available even after refreshing the page.

##  Features

* ➕ Add new tasks
* ⌨️ Press **Enter** to add a task
* ✏️ Edit existing tasks
* ✅ Mark tasks as completed
* ↩️ Undo completed tasks
* 🗑️ Delete individual tasks
* 🧹 Clear all tasks at once
* 💾 Store tasks using `localStorage`
* 🔢 Display the total number of tasks
* 🎯 Automatically focus the input after adding a task
* 📱 Responsive design for smaller screens
* 🎨 Clean and simple user interface

##  Technologies Used 🛠️

* **HTML5** – Structure of the application
* **CSS3** – Styling, layout, responsive design, transitions, and animations
* **JavaScript** – Application logic and DOM manipulation
* **Local Storage** – Persistent task storage in the browser

##  Project Structure

```text
MyTodoList/
│
├── index.html
├── style.css
├── script.js
└── README.md
```

## How to Run

1. Clone or download this repository.

2. Open the project folder.

3. Open `index.html` in your browser.

That's it! No server or additional dependencies are required.

##  How It Works

### ➕ Add a Task

Enter a task in the input field and click **Add**.

You can also press **Enter** to add the task.

### ✅ Complete a Task

Click the **Done** button to mark a task as completed.

The task receives a wavy line-through style and the button changes to **Undo**.

### ✏️ Edit a Task

Click **Edit** and enter the updated task name.

### 🗑️ Delete a Task

Click **Delete** to remove an individual task.

### 🧹 Clear All Tasks

Click **Clear All** to remove every task from the list.

## 💾 Data Persistence

Tasks are stored in the browser using:

```javascript
localStorage
```

This means the tasks remain available after refreshing or reopening the page in the same browser.

## 📱 Responsive Design

The application includes responsive CSS so the layout adapts to smaller screen sizes.

On smaller screens:

* The input and Add button are arranged vertically.
* Task items can wrap when necessary.
* The main container adjusts its width and padding.

## 📚 What I Practiced

This project helped me practice several important JavaScript concepts:

* DOM selection
* DOM element creation
* Event listeners
* Event handling
* Functions
* Arrays
* Array methods
* `localStorage`
* JSON parsing and stringifying
* Conditional statements
* Template literals
* Keyboard events
* CSS classes
* Dynamic UI updates

## 🔮 Future Improvements

Some possible improvements for the project include:

* Add task completion persistence
* Add task categories
* Add priority levels
* Add due dates
* Add search and filtering
* Add dark mode
* Add drag-and-drop task ordering

## 👩‍💻 Author

**Neharika Bonu**

Built as a JavaScript practice project while learning DOM manipulation, events, browser storage, and interactive web development.
