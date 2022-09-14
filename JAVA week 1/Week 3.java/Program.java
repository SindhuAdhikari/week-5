public class Program {

    public static void main (String[] args){
        Eagle eagle= new Eagle();
        display(eagle);

        Penguin penguin=new Penguin();
        display(penguin);
    }
    // Dependency inversion
    public static void display(Bird bird){
        bird.eat();
        bird.run();
    }
    public static void displayallu(FlightfullBird fBird){
        fBird.fly();
    }

}
