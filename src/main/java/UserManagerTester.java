import java.util.ArrayList;
import java.util.List;

public class UserManagerTester {
    public static void main(String[] args) {
        //MainUsers
        MainUser mainUser1 = new MainUser("Mirtha Legrand", "mirtha@gmail.com", 107, "M1");
        MainUser mainUser2 = new MainUser("Anabel", "anabel@gmail.com", 84, "M2");
        MainUser mainUser3 = new MainUser("Carlos", "carlos@gmail.com", 78, "M3");
        MainUser mainUser4 = new MainUser("Marta", "lucia@gmail.com", 93, "M4");
        MainUser mainUser5 = new MainUser("Jorge", "jorge@gmail.com", 88, "M5");

        //KeeperUsers
        KeeperUser keeper1 = new KeeperUser("Luis", "luis@gmail.com", 30, "K1");
        KeeperUser keeper2 = new KeeperUser("Maria", "maria@gmail.com", 25, "K2");
        KeeperUser keeper3 = new KeeperUser("Laura", "laura@gmail.com", 28, "K3");
        KeeperUser keeper4 = new KeeperUser("Pedro", "pedro@gmail.com", 40, "K4");
        KeeperUser keeper5 = new KeeperUser("Clara", "clara@gmail.com", 33, "K5");
        KeeperUser keeper6 = new KeeperUser("Javier", "javier@gmail.com", 38, "K6");
        KeeperUser keeper7 = new KeeperUser("Marta", "marta@gmail.com", 29, "K7");
        KeeperUser keeper8 = new KeeperUser("Sofía", "sofia@gmail.com", 27, "K8");
        KeeperUser keeper9 = new KeeperUser("Tomás", "tomas@gmail.com", 32, "K9");
        KeeperUser keeper10 = new KeeperUser("Diego", "diego@gmail.com", 34, "K10");

        //UserManager
        UserManager userManager = new UserManager();

        //Add MainUsers
        userManager.addMainUser(mainUser1);
        userManager.addMainUser(mainUser2);
        userManager.addMainUser(mainUser3);
        userManager.addMainUser(mainUser4);
        userManager.addMainUser(mainUser5);

        //Asign KeeperUsers to each MainUser
        userManager.addKeeperUser(mainUser1, keeper1);
        userManager.addKeeperUser(mainUser1, keeper2);
        userManager.addKeeperUser(mainUser1, keeper3);

        userManager.addKeeperUser(mainUser2, keeper4);
        userManager.addKeeperUser(mainUser2, keeper5);
        userManager.addKeeperUser(mainUser2, keeper6);

        userManager.addKeeperUser(mainUser3, keeper7);
        userManager.addKeeperUser(mainUser3, keeper8);
        userManager.addKeeperUser(mainUser3, keeper9);

        userManager.addKeeperUser(mainUser4, keeper2);
        userManager.addKeeperUser(mainUser4, keeper5);
        userManager.addKeeperUser(mainUser4, keeper10);

        userManager.addKeeperUser(mainUser5, keeper1);
        userManager.addKeeperUser(mainUser5, keeper4);
        userManager.addKeeperUser(mainUser5, keeper9);

        // Show each MainUser with their KeeperUsers
        System.out.println("Relaciones entre MainUsers y KeeperUsers:");
        System.out.println(userManager);

        // Show associated KeeperUsers for a MainUser
        System.out.println("Keepers asociados a " + mainUser3.getName() + ":");
        for (KeeperUser keeper : userManager.getKeeperUsers(mainUser3)) {
            System.out.println("- " + keeper.getName());
        }
    }
}

