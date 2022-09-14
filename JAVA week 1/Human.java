import java.util.ArrayList;

public class Human extends Mammel {
    private String address;
    private ArrayList<String>skills;
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public ArrayList<String> getSkills(){
        return skills;
    }
    public void setSkills(ArrayList<String>skills){
        this.skills=skills;
    }

    public Human(String name,int age,String gender,String color,String address,ArrayList<String>skills){
        super(name,age,gender,color);
        this.address=address;
        this.skills=skills;
    }
    public void display(){
        super.display();
        System.out.println("The address is"+address);
        String personSkill = "";
        for(String skill:skills){
            personSkill = personSkill + skill + ", "; 
        }
        System.out.println("The skills are "+personSkill+"etc.");
    }
}
