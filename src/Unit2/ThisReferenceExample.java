package Unit2;

public class ThisReferenceExample {

    public void doProces(int i, Process p){
        p.proces(i);
    }
     public void execute(){
        doProces(10, i -> {
            System.out.println(i);
            System.out.println(this);});
     }
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProces(10, new Process() {

            @Override
            public void proces(int i) {
                System.out.println("value of i is "+i);
                System.out.println(this);
                
            }
            public String toString(){
                return "This is the annonymus inner class";
            }
            
        });
        // System.out.println(this); // doesn't work here
        thisReferenceExample.doProces(10, i -> {
            System.out.println(i);
            // System.out.println(this); // this doesn't work in lambda, like it dosn't work in main (we can't use this in static method!!)
        });
        thisReferenceExample.execute();
    }

    public String toString(){
        return "This is the main ThisReferenceExample class";
    }
    
}
