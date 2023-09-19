package JGenerics.Project.Main;

import java.util.Arrays;

import JGenerics.Project.Contract;
import JGenerics.Project.ContractManager;
import JGenerics.Project.ContractToText;
import JGenerics.Project.Gender;
import JGenerics.Project.TeacherFactory;
import JGenerics.Project.SponserFactory;
import JGenerics.Project.Sponser;
import JGenerics.Project.Teacher;
import JGenerics.Project.UserManager;

public class GenericData {
    public static void main(String[] args) {
        // in another pkg so in this file you can't create Teacher or Sponser instance
        //  ou have to create instances via factory(not in main)
        // Teacher t = new Teacher("ali", "sadeghi", 25, Gender.Male);
        // Sponser s = new Sponser("reza", "alikhani", 45, Gender.Male);

        // it can't use abstract because it return Person type that it's not applicable
        TeacherFactory teacherfactory = new TeacherFactory();
        SponserFactory sponserfactory = new SponserFactory();
        // to manage all instances
        UserManager<Teacher> teachers = new UserManager<>();
        System.out.println(teachers.getClass());
        UserManager<Sponser> sponsers = new UserManager<>();
        
        // add one item
        teachers.addUser(teacherfactory.create("ali", "sadeghi", 25, Gender.Male));
        // add by list
        teachers.addAll(Arrays.asList(teacherfactory.create("sara", "kiani", 18, Gender.Female),
        teacherfactory.create("ahmadi", "mohsen", 25, Gender.Male),
        teacherfactory.create("abraham", "lincoln", 56, Gender.Male),
        teacherfactory.create("maryam", "mirzaee", 32, Gender.Female)
        ));

        System.out.println(teachers);
        teachers.printAll();

        sponsers.addUser(sponserfactory.create("reza", "khakzad", 30, Gender.Male));
        System.out.println(sponsers.getListof()+ " " +teachers.getListof());
        try{
            Contract c = new Contract((Sponser)sponsers.getListof().get(0),(Teacher) teachers.getListof().get(0), "Python Biginner", "001");
            System.out.println(c.getInstructor()+" ");
            ContractManager contractmanager = new ContractManager();
            contractmanager.addContract(c);
            contractmanager.addAll(Arrays.asList(new Contract((Sponser)sponsers.getListof().get(0),(Teacher) teachers.getListof().get(1), "Java Biginner", "002"),
            new Contract((Sponser)sponsers.getListof().get(0),(Teacher) teachers.getListof().get(2), ".Net Biginner", "003"),
            new Contract((Sponser)sponsers.getListof().get(0),(Teacher) teachers.getListof().get(3), "C++ Biginner", "004")
            // new Contract((Sponser)sponsers.getListof().get(0),(Teacher) teachers.getListof().get(3), "Python Biginner", "005") // this will cause of Instructor is not available!
            ));
            System.out.println(contractmanager.getInstancesList());
            System.out.println(teachers.getInstancesList());
            // Contract c2 = new Contract((Sponser)sponsers.getListof().get(0),(Teacher) teachers.getListof().get(0), "Python Biginner", "002");
            ContractToText.toText(contractmanager.getInstancesList());
            // Teacher t = ((Teacher) teachers.getListof().get(2));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
