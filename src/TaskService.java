import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TaskService {
    Map<Integer, Task> task = new HashMap<>();

    public void addTask(int numberTask) {
        System.out.println("Название задачи: ");
        String title = Main.enterString();
        System.out.println("Описание: ");
        String description = Main.enterString();
        System.out.println("Выберите тип задачи: ");
        System.out.println("1. Рабочая \n" + "2. Личная");
        String type = Type.choiceType();
        System.out.println("\nВыберите повторяемость задачи:");
        System.out.println("1. Однократная.\n" + "2. Ежедневная. \n" + "3. Еженедельная. \n" + "4. Ежемесячная. \n" + "5. Ежегодная.");
        String timeChoice = NewData.choiceTime();
        System.out.println("Повторение задачи ");
        task.put(numberTask, new Task(title, description, type, timeChoice ));
    }
    public void removeTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Под каким номером задачу хотите удалить?");
        int numberTask = scanner.nextInt();
        task.remove(numberTask);
    }
    public void printTask() {
        for (Map.Entry<Integer, Task> number : task.entrySet()) {
            System.out.println("Задача №" + number.getKey() + ". " + number.getValue());
        }
    }
}