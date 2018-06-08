package VoteSystemHandilingPackage;

public class Voter
{
   public String name;
   private int Age;

    public Voter(String name, int Age) {
        this.name = name;
        this.Age = Age;
    }
   
    public void isApplicable() throws AgeExceptionClass{
        if(this.Age<18)
        {
            throw new AgeExceptionClass(18-Age);
        }
        else
        {
            System.out.println("You're Applicable For Voting !!!");
        }
    }
}
