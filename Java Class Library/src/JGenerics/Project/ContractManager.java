package JGenerics.Project;

import java.util.LinkedList;
import java.util.List;

// without generics (only for contract)
public class ContractManager {
    private LinkedList<Contract> listof;

    
    public ContractManager(){
        this.listof = new LinkedList<>();
    }
    
    public LinkedList<Contract> getListof() {
        return listof;
    }

    // add single user
    public void addContract(Contract t){
        listof.add(t);
    }

    // add multiple user
    public void addAll(List<Contract> t){

        this.listof.addAll(t);
    }

    // print all
    public void printAll(){
        this.listof.forEach(System.out::println);
    }

    @Override
    public String toString(){return this.listof.toString();}
    
}
