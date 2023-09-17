package JGenerics.Project;

final public class Sponser extends Person{
    private Contract contract;
    Sponser(String firstname, String lastname, int age, Gender gender) {
        super(firstname, lastname, age, Role.Sponser, gender);
    }
    public Contract getContract() {
        return contract;
    }
    public void setContract(Contract contract) {
        this.contract = contract;
    }
}

