public class Bat extends Mammel {
    private int wings;
    
    public Bat(String name,int age,String gender,String color,int wings){
        super(name,age,gender,color);
        this.wings=wings;
    }
    public int getWings(){
        return wings;
    }
    public void setWings(int wings){
        this.wings=wings;
    }
    public void display(){
        super.display();
        System.out.println("The wings are"+wings);
    }
}
