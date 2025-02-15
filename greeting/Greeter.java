package greeting;

/**
 * Greeter class demonstrates basic OOP concepts with personalized greetings.
 */
public class Greeter {
    // Fields representing object state
    private final String name;
    private final String campus;

    // Default values for workshop participants
    private static final String DEFAULT_NAME = "Workshop Participant";
    private static final String DEFAULT_CAMPUS = "Virtual Campus";

    /**
     * Constructor initializes the Greeter object with name and campus
     * 
     * @param name   Participant's name
     * @param campus Campus location
     */
    public Greeter(String name, String campus) {
        this.name = name;
        this.campus = campus;
    }

    /**
     * Generates a personalized greeting message
     */
    public void printGreetings() {
        System.out.println("\n=== Welcome to COE Coding Workshop ===");
        System.out.println("Hello! I'm " + name);
        System.out.println("Joining from: " + campus);
        System.out.println("===============================\n");
    }

    /**
     * Repeats the greeting message
     */
    // public void repeatGreeting(int times) {
    // for (int i = 0; i < times; i++) {
    // System.out.println("Greeting #" + i + ": Hello! I'm " + name + ", Joining
    // from: " + campus);
    // }
    // }

    /**
     * Main execution method with workshop-specific modifications
     * 
     * @param args Command-line arguments [name] [campus]
     */
    public static void main(String[] args) {
        // Handle command-line input with fallback defaults
        String participantName = args.length > 0 ? args[0] : DEFAULT_NAME;
        String participantCampus = args.length > 1 ? args[1] : DEFAULT_CAMPUS;

        // Create and configure Greeter object
        Greeter workshopGreeter = new Greeter(participantName, participantCampus);

        // Generate and display greeting
        workshopGreeter.printGreetings();

        // Repeat greeting messages
        // workshopGreeter.repeatGreeting(3);

        // Workshop task instructions
        System.out.println("Workshop Task:");
        System.out.println("1. Replace DEFAULT_NAME and DEFAULT_CAMPUS with your info");
        System.out.println("2. Experiment with different campus names!");
        System.out.println("3. (Optional) Add a new method to display multiple greetings\n");
    }
}
