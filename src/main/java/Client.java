/**
 * Created by Admin on 08.10.2017.
 */
public class Client {
    private String id;
    private String name;
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

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
