package JGenerics.Project;

final public class Teacher extends Person {
    private Contract contract;
    private Boolean availability = true;
    private String teachingSubject;
    private String classID;
    
    Teacher(String firstname, String lastname, int age, Gender gender) {
        super(firstname, lastname, age, Role.Teacher, gender);
    }
    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }


    public Boolean getAvailability() {
        return availability;
    }
    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    public String getTeachingSubject() {
        return teachingSubject;
    }
    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    } 

}
