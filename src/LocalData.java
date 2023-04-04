import java.time.LocalDate;

public class LocalData {
    public String oneTimeTask() {
        LocalDate date = LocalDate.now();
        String typeTasker = "oднократная задача.";
        return typeTasker;
    }

    public String dailyTask() {
        LocalDate date = LocalDate.now();
        String typeTasker = ("задача на день. Следует выполнить до " + date.plusDays(1));
        return typeTasker;
    }

    public String weeklyTask() {
        LocalDate date = LocalDate.now();
        String typeTasker = ("задача на неделю. Следует выполнить до " + date.plusWeeks(1));
        return typeTasker;
    }

    public String mothlyTask() {
        LocalDate date = LocalDate.now();
        String typeTasker = ("задача на месяц. Следует выполнить до " + date.plusMonths(1));
        return typeTasker;
    }

    public String yearlyTask() {
        LocalDate date = LocalDate.now();
        String typeTasker = ("задача на год. Следует выполнить до " + date.plusYears(1));
        return typeTasker;
    }
}

