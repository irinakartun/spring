/**
 * Created by Admin on 08.10.2017.
 */
public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event event)
    {
        System.out.println(event.toString());
    }
}
