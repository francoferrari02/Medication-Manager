import java.util.Set;
import java.util.TreeSet;

public class KeeperUser {
    protected String name;
    private String email;
    private int edad;
    protected String id;

    public KeeperUser(String name, String email, int edad, String id) {
        this.name = name;
        this.email = email;
        this.edad = edad;
        this.id = id;

    }

    @Override
    public String toString() {
        return  name + ", id: " + id;
    }


    //getters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getEdad() {
        return edad;
    }
    public String getId() {
        return id;
    }

}
