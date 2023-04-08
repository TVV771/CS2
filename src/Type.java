public class Type {
    public static String choiceType() {
        while (true) {
            repeat:
            switch (Main.enterInt()) {
                case (1):
                    return "рабочая";
                case (2):
                    return "личная";
                default:
                    System.out.println("Можно вводить 1 или 2. Попробуйте еще!");
                    break repeat;
            }
        }
    }
}