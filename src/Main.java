import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static String enterString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static int enterInt() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Необходимо ввести цифры.");
        }
        return  number;
    }

    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        int i = 0;
        while (true) {
            System.out.println("\nВыберите пункт из меню.");
            System.out.println("1. Добавить задачу.\n" + "2. Удалить задачу. \n" + "3. Показать весь список задач. \n" + "4. Выйти из программы. ");
//            int vvod = enterInt();
            repit:
            switch (enterInt()) {
                case (1):
                    i++;
                    taskService.addTask(i);
                    break repit;
                case (2):
                    taskService.removeTask();
                    break repit;
                case (3):
                    taskService.printTask();
                    break repit;
                case (4):
                    System.exit(0);
                default:
                    System.out.println("Попробуйте еще!");
                    break repit;
            }
        }
    }
        }
