import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Admin on 08.10.2017.
 */
public class Event {
    private int id;
    private String msg;
    private Date date;
    private DateFormat df;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Event(int id, Date date) {
        Random rn = new Random();
        this.id = rn.nextInt(100);
        this.date = date;
    }

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + df.format(date) +
                '}';
    }
}
