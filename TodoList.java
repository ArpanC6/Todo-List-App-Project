import java.util.ArrayList;
import java.util.Scanner;

class TaskManager {
    private ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available!");
        } else {
            System.out.println("Your Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void removeTask(int taskNo) {
        if (taskNo > 0 && taskNo <= tasks.size()) {
            String removedTask = tasks.remove(taskNo - 1);
            System.out.println("Removed: " + removedTask);
        } else {
            System.out.println("Invalid task number!");
        }
    }
}

public class TodoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager todo = new TaskManager();
        int choice;

        System.out.println("Welcome to Java To-Do List");

        do {
            System.out.println("======== Menu ========:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    todo.addTask(task);
                    break;

                case 2:
                    todo.viewTasks();
                    break;

                case 3:
                    todo.viewTasks();
                    System.out.print("Enter task number to remove: ");
                    int taskNo = sc.nextInt();
                    todo.removeTask(taskNo);
                    break;

                case 4:
                    System.out.println("Exiting... Thank you for using To-Do List!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);
    }
}