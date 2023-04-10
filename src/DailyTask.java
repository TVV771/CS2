import java.lang.invoke.WrongMethodTypeException;

public class DailyTask extends Task {
    public DailyTask(String title, String description, String type, String timeChoice) throws WrongMethodTypeException {
        super(title, description, type, timeChoice);
    }

    @Override
    public boolean checkOccurance(LocalData requestedDate) { return true;}

    }

