package player;

public class Player {

    public String Name;
    public int Age;
    private double prizeMoney = 0.0;

    public Player(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public void setPrizeMoney(int numberOfMatches) {
        prizeMoney = numberOfMatches * 3000.00;
    }

    public double getPrizeMoney() {
        return this.prizeMoney;
    }

    public double bonus(int numberOfMatches) {
        if (numberOfMatches > 10) {
            return 1000.0;
        } else {
            return 0.0;
        }
    }

    public void displayInfo() {
        System.out.println("Name :" + Name + " , Age :" + Age);
    }
}
