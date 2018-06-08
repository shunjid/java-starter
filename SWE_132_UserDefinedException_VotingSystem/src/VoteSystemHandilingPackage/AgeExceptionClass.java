package VoteSystemHandilingPackage;

public class AgeExceptionClass extends Exception {

    private final int remainingAge;

    public AgeExceptionClass(int remainingAge) {
        this.remainingAge = remainingAge;
    }

    public int getRemainingAge() {
        return this.remainingAge;
    }

}
