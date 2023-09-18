package JGenerics.Project;

import java.util.Arrays;

public class GenericData {
    public static void main(String[] args) {
        // Teacher t = new Teacher("ali", "sadeghi", 25, Gender.Male);
        // Sponser s = new Sponser("reza", "alikhani", 45, Gender.Male);
        UserManager<Teacher> teachers = new UserManager<>();
        UserManager<Sponser> sponsers = new UserManager<>();
        
        teachers.addUser(new Teacher("ali", "sadeghi", 25, Gender.Male));
        teachers.addAll(Arrays.asList(new Teacher("sara", "kiani", 18, Gender.Female),
        new Teacher("ahmadi", "mohsen", 25, Gender.Male),
        new Teacher("abraham", "lincoln", 56, Gender.Male),
        new Teacher("maryam", "mirzaee", 32, Gender.Female)
        ));
        System.out.println(teachers);
        teachers.printAll();

        sponsers.addUser(new Sponser("ali", "sadeghi", 25, Gender.Male));

        try{
            // Contract c = new Contract(s, t, "Python Biginner", "001");
            // System.out.println(c.getInstructor()+" "+c.getSponser()+"\n"+t.getTeachingSubject()+" \n"+t.getAvailability()+" \n"+s.getContract());
            // Contract c2 = new Contract(s, t, "Python Biginner", "002");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
