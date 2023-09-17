package JGenerics.Project;

public class Contract {
    private Status status;
    private Teacher instructor;
    private Sponser sponser;
    
    public Contract(Sponser sponser, Teacher instructor, String teachingSubject, String classId) throws Exception{
        if (!instructor.getAvailability()){
            throw new Exception("Instructor is not available! ");
        }else {
            this.status = Status.Active;
            this.instructor = instructor;
            // make availabilty ->false
            instructor.setAvailability(false);
            this.sponser = sponser;
            instructor.setClassID(classId);
            instructor.setTeachingSubject(teachingSubject);
            sponser.setContract(this);
            instructor.setContract(this);
        }
    }

    public void deactivateContract(){
        this.status = Status.Deactive;
    }
    
    public Sponser getSponser() {
        return sponser;
    }

    public Teacher getInstructor() {
        return instructor;
    }
    public Status getStatus() {
        return status;
    }
    
    @Override
    public String toString(){
        return instructor.getTeachingSubject() + " contract between "+instructor.getFirstname()+" " + instructor.getLastname()+" and "+sponser.getFirstname() + ' ' + sponser.getLastname();
    }
}
