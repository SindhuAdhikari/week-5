import java.util.ArrayList;
public class Staff {
     public String name;
     public ArrayList<String> qualification;
     public double salary;
     public String address;
     public String position;

     public Staff(String name, ArrayList<String> qualification, double salary, String address, String position){
          this.name=name;
          this.qualification=qualification;
          this.salary=salary;
          this.address=address;
          this.position=position;
     }
     public void display() {
          System.out.println("The name of the staff is " + name);
          for(String q:qualification){

               System.out.println("The qualification of the staff is " +q);
          }
          System.out.println("The salary of the staff is " + salary);
          System.out.println("The address of the staff is " + address);
          System.out.println("The position of the staff is " + position);
}
}
