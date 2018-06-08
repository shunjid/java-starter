package codePackage;

public class Journey {

    public String PassengerName;
    public String From;
    public String To;
    public Double Distance;
    public Double TrainAcceleration;

    public Journey(String PassengerName, String From, String To, Double Distance, Double TrainAcceleration) {
        this.PassengerName = PassengerName;
        this.From = From;
        this.To = To;
        this.Distance = Distance;
        this.TrainAcceleration = TrainAcceleration;
    }

    /*------------------------
          S = u*t + 0.5 a*t^2      
       => S = 0.5 a*t^2        [initial velocity, u = 0.0 ms^-1]     
       => t^2 = S / (0.5 * a)     
       => t = Square Root (S / (0.5 * a))
    --------------------------*/
    public Double getTimeToReachVillage() {
        double time = Math.sqrt(Distance / (0.5 * TrainAcceleration));     
        return ReturnTimeInMinutes(time);
    }
    
    private Double ReturnTimeInMinutes(Double timeInSeconds)
    {
        return timeInSeconds/60;
    }

    public void DisplayInfo() {
        
        System.out.println("\n--------Info-----------\n");
        System.out.println("Passenger      :       " + PassengerName);
        System.out.println("From           :       " + From);
        System.out.println("To             :       " + To);
        System.out.println("Distance       :       " + Distance/1000 + " KiloMeter");
        System.out.println("Time to Travel :       " + getTimeToReachVillage() + " Minutes");
        System.out.println("\n--------Thanks-----------\n");
    }

}
