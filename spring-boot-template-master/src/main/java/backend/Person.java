package backend;

/**
 * Created by USER on 28.05.2017.
 */
public class Person {
    private int id;
    private String name;
    private String password;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Person(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
