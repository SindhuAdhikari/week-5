import java.util.ArrayList;
public class School {
public String name;
public int rollno;
public String address;
public int contactnumber;
public ArrayList<Student> qualities;

public School(String name, int rollno, String address, int contctnumber, ArrayList<Student> qualities)
{
    this.name = name;
    this.rollno = rollno;
    this.address = address;
    this.contactnuber = contactnumber;
    this.qualities = qualities;
}
public void display() {
    System.out.println("The name of the student is " + name);
    System.out.println("The rollno of the student is " + rollno);
    System.out.println("The address of the student is " + address);
    System.out.println("The contact number of the student is " + address);
    for(Student school:qualities)
    {
        
    }
}
}


