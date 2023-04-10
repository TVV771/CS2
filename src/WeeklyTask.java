public class WeeklyTask extends Task {
    public WeeklyTask(String title, String description, String type, String timeChoice) {
        super(title, description, type, timeChoice);
    }

    @Override
    public boolean checkOccurance(LocalData requestedDate) {
        return getNewData().dataNow().equals(requestedDate.weeklyTask());
    }
}
