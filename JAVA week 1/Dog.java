public class Dog extends Mammel {
    private String breed;

     public String getBreed(){
        return breed;
     }
     public void setBreed(String breed){
        this.breed=breed;
     }
     public Dog(String breed,String name,int age,String gender,String color){
        super(name,age,gender,color);
        this.breed=breed;
     }
public void display(){
    super.display();
    System.out.println("The breed is"+breed);
}
}
