import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerCheck<formatForDateNow> implements Logger{
    protected int num = 1;
    private static LoggerCheck instance;
    String time;
    String msg;
    private static LoggerCheck logger;

    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private LoggerCheck() {
        this.time = dateFormat.format(date);
        this.num = num;
    }

    public static LoggerCheck getInstance() {
        if (instance == null) instance = new LoggerCheck();
        return instance;
    }

    @Override
    public void log(String msg) {
        System.out.println( " [" + time + ", " + num++ + "] " + msg  );
    }

}