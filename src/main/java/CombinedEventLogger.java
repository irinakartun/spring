import java.util.List;

/**
 * Created by Admin on 10.10.2017.
 */
public class CombinedEventLogger implements EventLogger {
    private List<EventLogger> loggers;

    public CombinedEventLogger(List<EventLogger> loggers) {
        this.loggers = loggers;
    }

    public void logEvent(Event event) {
        for (EventLogger eventLogger : loggers)
        {
            eventLogger.logEvent(event);
        }
    }
}
