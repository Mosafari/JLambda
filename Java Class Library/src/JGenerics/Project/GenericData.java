package JGenerics.Project;

public class GenericData {
    public static void main(String[] args) {
        Teacher t = new Teacher("ali", "sadeghi", 25, Gender.Male);
        Sponser s = new Sponser("reza", "alikhani", 45, Gender.Male);

        try{
            Contract c = new Contract(s, t, "Python Biginner", "001");
            System.out.println(c.getInstructor()+" "+c.getSponser()+"\n"+t.getTeachingSubject()+" \n"+t.getAvailability()+" \n"+s.getContract());
            Contract c2 = new Contract(s, t, "Python Biginner", "002");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
