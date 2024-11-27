public class Medication implements Comparable<Medication>{
    private String name;
    private String description;
    private MedType type;

    public Medication(String name, String description, MedType type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    @Override
    public int compareTo(Medication m) {
        return this.name.compareTo(m.name);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
