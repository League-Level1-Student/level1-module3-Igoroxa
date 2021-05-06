package _01_intro_to_static;

public class athlete {
	static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        athlete bob = new athlete("bob", 20);
        System.out.println(bob.name);
        System.out.println(bob.bibNumber);
        System.out.println(bob.raceLocation);
        
        athlete sam = new athlete("sam", 25);
        System.out.println(sam.name);
        System.out.println(sam.bibNumber);
        System.out.println(sam.raceLocation);
        
      
    	//create two athletes
        //print their names, bibNumbers, and the location of their race. 
    }
}
