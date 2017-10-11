import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Admin on 08.10.2017.
 */
public class FileEventLogger implements EventLogger {
    private String filename;

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    public void logEvent(Event event) {
        System.out.println("writing in file");
        File file = new File(filename);
        try {
            FileUtils.writeStringToFile(file, event.toString(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void init() throws IOException {
        System.out.println("start init");
        File file = new File(filename);
        file.canWrite();
    }
}
