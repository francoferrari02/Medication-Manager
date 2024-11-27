import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class MainUser extends KeeperUser {
    private Set<Medication> medications;
    private Set<KeeperUser> keepers;

    public MainUser(String name, String email, int edad, String id) {
        super(name, email, edad, id);
        this.medications= new TreeSet<>();
        this.keepers= new TreeSet<>();
    }

    //method to add medication to the mainUser
    public void addMedication(Medication medication) {
        this.medications.add(medication);
    }

    //method to remove medication from the mainUser
    public void removeMedication(Medication medication) {
        this.medications.remove(medication);
    }

    //method to add keeper to the mainUser
    public void addKeeper(KeeperUser keeper) {
        this.keepers.add(keeper);
    }

    //method to remove keeper from the mainUser
    public void removeKeeper(KeeperUser keeper) {
        this.keepers.remove(keeper);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainUser mainUser = (MainUser) o;
        return Objects.equals(id, mainUser.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "MainUser{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
    }


    //getters
    public Set getMedications() {
        return medications;
    }

    public Set getKeepers() {
        return keepers;
    }



}
