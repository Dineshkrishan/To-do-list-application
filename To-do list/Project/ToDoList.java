package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    private List<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task '" + task + "' added successfully!");
    }

    public void markCompleted(String task) {
        if (tasks.contains(task)) {
            System.out.println("Task '" + task + "' marked as completed.");
        } else {
            System.out.println("Task '" + task + "' not found in the list.");
        }
    }

    public void deleteTask(String task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
            System.out.println("Task '" + task + "' deleted successfully!");
        } else {
            System.out.println("Task '" + task + "' not found in the list.");
        }
    }

    public void viewTasks() {
        if (!tasks.isEmpty()) {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        } else {
            System.out.println("No tasks in the list.");
        }
    }

    public static void main(String[] args) {
        ToDoList todoApp = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTodo List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Delete Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1/2/3/4/5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String taskToAdd = scanner.nextLine();
                    todoApp.addTask(taskToAdd);
                    break;
                case 2:
                    todoApp.viewTasks();
                    System.out.print("Enter the task to mark as completed: ");
                    String taskToMark = scanner.nextLine();
                    todoApp.markCompleted(taskToMark);

                    break;
                case 3:
                    todoApp.viewTasks();
                    System.out.print("Enter the task to delete: ");
                    String taskToDelete = scanner.nextLine();
                    todoApp.deleteTask(taskToDelete);
                    break;
                case 4:
                    todoApp.viewTasks();
                    break;
                case 5:
                    System.out.println("Exiting the application. Have a great day!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}