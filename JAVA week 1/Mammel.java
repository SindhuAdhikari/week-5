public class Mammel {
    private String name;
    private int age;
    private String gender;
    private String color;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setName(int age){
        this.age=age;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public Mammel(String name,int age,String gender,String color){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.color=color;
    }
    public void display(){
        System.out.println("The name is"+name);
        System.out.println("The age is"+age);
        System.out.println("The gender is"+gender);
        System.out.println("The color is"+color);
    }
}
