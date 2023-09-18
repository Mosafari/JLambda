package JGenerics.Project;

public class SponserFactory{

    public Sponser create(String firstname, String lastname, int age, Gender gender) {
        return new Sponser(firstname, lastname,  age, gender);
    }
}