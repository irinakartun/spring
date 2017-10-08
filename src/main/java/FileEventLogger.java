import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * Created by Admin on 08.10.2017.
 */
public class FileEventLogger implements EventLogger {
    private String filename;

    public void logEvent(Event event) {
        File file = new File(filename);
 //       FileUtils.writeStringToFile(file, String str, true);
    }
}
