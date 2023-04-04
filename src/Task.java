public class Task {

    private final String title;
    private final String type;
    private final String timeChoice;
    private final int id;
    private static int generId = 0;
    private final String description;
    private final NewData newData = new NewData();

    public NewData getNewData() {
        return newData;
    }
    public Task(String title, String description, String type, String timeChoice) {
        this.title = title;
        this.type = type;
        this.id = generId++;
        this.description = description;
        this.timeChoice = timeChoice;
    }
    public String getTimeChoice() {
        return timeChoice;
    }
    public String getType() {
        return type;
    }
    public String getTitle() {
        return title;
    }

    public int getGenerId() {
        return generId;
    }

    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return "Название - " + getTitle() + ", описание - " + getDescription() + ", тип задачи: " + getType() + ", создано: " + getNewData().dataNow() + " " + getTimeChoice();
    }
}

