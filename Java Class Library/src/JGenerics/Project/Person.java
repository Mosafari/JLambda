package JGenerics.Project;

public abstract class Person {
    private String firstname;
    private String lastname;
    private int age;
    private Role role;
    private Gender gender;
    
    Person(String firstname, String lastname, int age, Role role, Gender gender){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age =age;
        this.role = role;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    // public void setRole(Role role) {
    //     this.role = role;
    // }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
}

