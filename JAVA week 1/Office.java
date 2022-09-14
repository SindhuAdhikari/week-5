import java.util.ArrayList;
public class Office{
    public static void main(String[] args) {
        ArrayList<String> qualifications = new ArrayList<String>();
        qualifications.add("architecture");
        qualifications.add("nursing");
        qualifications.add("bit");
        qualifications.add("bca");
        
        Staff abhishek= new Staff("abhishek", qualifications, 20000, "pokhera", "coordinator");
        abhishek.display();
        qualifications.clear();
        qualifications.add("bcis");
        qualifications.add("HA");
        qualifications.add("BSC nursing");
        qualifications.add("Art");
        Staff ram= new Staff("ram", qualifications, 30000, "kathmandu", "ITcian");
        ram.display();
    }
}