public class OncelyTask extends Task {
    public OncelyTask(String title, String description, String type, String timeChoice) {
        super(title, description, type, timeChoice);
    }

    @Override
    public boolean checkOccurance(LocalData requestedDate) {
        return getNewData().dataNow().equals(requestedDate.oneTimeTask());
    }
}
