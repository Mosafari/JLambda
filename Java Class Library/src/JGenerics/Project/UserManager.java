package JGenerics.Project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// to only accept Person or subClasses (using generics)
public class UserManager<T extends Person > {
    private LinkedList<? super T> listof;
    // now you can get manager instance, but for Teacher and Sponser Will return same Result (like Borg Design Pattern/ Shared field)
    private static List<UserManager<? extends Person>> instanceslist = new ArrayList<>();

    
    public UserManager(){
        this.listof = new LinkedList<>();
        instanceslist.add(this);
    }

    public List<UserManager<? extends Person>> getInstancesList(){return UserManager.instanceslist;}

    
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
