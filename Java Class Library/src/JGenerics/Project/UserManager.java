package JGenerics.Project;

import java.util.LinkedList;
import java.util.List;

// to only accept Person or subClasses
public class UserManager<T extends Person > {
    private LinkedList<? super T> listof;

    
    UserManager(){
        this.listof = new LinkedList<>();
    }
    
    public LinkedList<? super T> getListof() {
        return listof;
    }

    // add single user
    public void addUser(T t){
        listof.add(t);
    }

    // add multiple user
    public void addAll(List<T> t){

        this.listof.addAll(t);
    }

    // print all
    public void printAll(){
        this.listof.forEach(System.out::println);
    }

    @Override
    public String toString(){return this.listof.toString();}
    
}
