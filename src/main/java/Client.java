/**
 * Created by Admin on 08.10.2017.
 */
public class Client {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
    }
}