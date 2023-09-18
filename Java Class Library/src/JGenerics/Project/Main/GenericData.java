package JGenerics.Project.Main;

import java.util.Arrays;

import JGenerics.Project.Contract;
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
        UserManager<Teacher> teachers = new UserManager<>();
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
            Contract c2 = new Contract((Sponser)sponsers.getListof().get(0),(Teacher) teachers.getListof().get(0), "Python Biginner", "002");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
