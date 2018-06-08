package VoteSystemHandilingPackage;

public class MainClass {

    public static void main(String[] args) {
        Voter voter1 = new Voter("Shunjid Rahman Showrov", 18);
        Voter voter2 = new Voter("Zubayer Himel", 16);

        try {
            voter1.isApplicable();
            System.out.println();
            voter2.isApplicable();

        } catch (AgeExceptionClass e) {
            System.out.println("Sorry " + voter2.name + " , You Need To Wait At Least " + e.getRemainingAge()
                    + " Year More To Become A Voter\n");
        }
    }

}
