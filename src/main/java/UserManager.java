import java.util.*;

public class UserManager {
    private Map<MainUser, List<KeeperUser>> userMap;

    public UserManager(){
        this.userMap = new HashMap<>();
    }

    //method to add a mainUser to the system
    public void addMainUser(MainUser mainUser){
        userMap.putIfAbsent(mainUser, new ArrayList<>());
    }

    //method to add a keeperUser to the system
    public void addKeeperUser(MainUser mainUser, KeeperUser keeperUser){
        userMap.get(mainUser).add(keeperUser);
    }

    //method to get the keeperUsers associated with a mainUser
    public List<KeeperUser> getKeeperUsers(MainUser mainUser){
        return userMap.getOrDefault(mainUser, Collections.emptyList());
    }

    //method to delete a keeperUser from an especific mainUser
    public void removeKeeperUser(MainUser mainUser, KeeperUser keeperUser){
        List<KeeperUser> keepers = userMap.get(mainUser);
        if (keepers != null){
            keepers.remove(keeperUser);
        }
    }

    //method to delete a mainUser from the system
    public void removeMainUser(MainUser mainUser){
        userMap.remove(mainUser);
    }

    //method to print all the mainUsers with their keeperUsers in the system
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        userMap.forEach((mainUser, keepers) -> {
            builder.append("MainUser: ").append(mainUser).append("\n");
            builder.append("Keepers: ").append(keepers).append("\n\n");
        });
        return builder.toString();
    }






}
