import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 09.10.2017.
 */
public class CacheFileEventLogger extends FileEventLogger {

    private int cacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(String filename, int cacheSize)
    {
        super(filename);
        this.cacheSize = cacheSize;
        cache = new ArrayList<Event>();
    }

    @Override
    public void logEvent(Event event) {
        cache.add(event);
        if (cache.size() == cacheSize) {
            writeEventsFromCache();
            cache.clear();
        }
    }

    public void destroy()
    {
        System.out.println("start destroy");
        if (!cache.isEmpty()) {
            writeEventsFromCache();
        }
    }


    private void writeEventsFromCache()
    {
        for (Event event : cache)
        {
            super.logEvent(event);
        }
    }
}
