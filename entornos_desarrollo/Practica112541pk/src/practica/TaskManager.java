package practica;
import java.util.stream.Collectors;

class Task {
    private int id;
    private String name;
    private boolean completed;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        this.completed = false;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public boolean isCompleted() { return completed; }

    public void setName(String name) { this.name = name; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", completed=" + completed +
                '}';
    }
}

class TaskManager {
    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask(String name) {
        tasks.add(new Task(nextId++, name));
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public Optional<Task> getTaskById(int id) {
        return tasks.stream().filter(task -> task.getId() == id).findFirst();
    }

    public boolean updateTask(int id, String newName, boolean completed) {
        Optional<Task> taskOpt = getTaskById(id);
        if (taskOpt.isPresent()) {
            Task task = taskOpt.get();
            task.setName(newName);
            task.setCompleted(completed);
            return true;
        }
        return false;
    }

    public boolean deleteTask(int id) {
        return tasks.removeIf(task -> task.getId() == id);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        
        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Update Task\n4. Delete Task\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    taskManager.addTask(name);
                    break;
                case 2:
                    System.out.println("Tasks: " + taskManager.getTasks());
                    break;
                case 3:
                    System.out.print("Enter task ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("New name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Completed (true/false): ");
                    boolean completed = scanner.nextBoolean();
                    taskManager.updateTask(id, newName, completed);
                    break;
                case 4:
                    System.out.print("Enter task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    taskManager.deleteTask(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

