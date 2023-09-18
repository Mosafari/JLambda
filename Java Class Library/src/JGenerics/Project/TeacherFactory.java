package JGenerics.Project;

public class TeacherFactory{

    public Teacher create(String firstname, String lastname, int age, Gender gender) {
        return new Teacher(firstname, lastname,  age, gender);
    }
    
}