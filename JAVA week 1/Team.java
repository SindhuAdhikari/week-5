import java.util.ArrayList;
public class Team {
    public String name;
    public Double establisheddate;
    public ArrayList<Player> players;
    public Team(String name, Double establisheddate, ArrayList<Player> players )
    {
        this.name = name;
        this.establisheddate = establisheddate;
        this.players = players;
    }
    public void display() {
        System.out.println("The name of the Team is " + name);
        System.out.println("The team was established on " + establisheddate);
        for(Player player:players)
        {
        player.display();
        }
    }
}
