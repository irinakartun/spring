import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by Admin on 08.10.2017.
 */
public class App {
    private Client client;
    private EventLogger eventLogger;
    private Map<EventType, EventLogger> loggers;

    public App(Client client, EventLogger eventLogger, Map<EventType, EventLogger> loggers) {
        this.client = client;
        this.eventLogger = eventLogger;
        this.loggers = loggers;
    }

    public void logEvent(EventType type, Event event)
    {
        if (loggers.containsKey(type))
        {
            loggers.get(type).logEvent(event);
        }
        else
        {
            eventLogger.logEvent(event);
        }
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) ctx.getBean("app");
        Event event = (Event) ctx.getBean("event");
        app.logEvent(EventType.ERROR, event);
        System.out.println();
        app.logEvent(EventType.INFO, event);
        System.out.println();
        app.logEvent(null, event);
        System.out.println();
        ctx.close();
    }
}
