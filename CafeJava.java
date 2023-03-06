public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly!";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 5.5;
        double lattePrice = 6.5;
        double cappucinoPrice = 9;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(isReadyOrder1 ? customer1 + readyMessage : customer1 + pendingMessage);
        if (isReadyOrder1) {
            System.out.println(displayTotalMessage + dripCoffeePrice);
        }

        System.out.println(generalGreeting + customer4); // Displays "Welcome to Cafe Java, Noah"
        System.out.println(isReadyOrder4 ? customer4 + readyMessage : customer4 + pendingMessage);
        if (isReadyOrder4) {
            System.out.println(displayTotalMessage + cappucinoPrice);
        }

        System.out.println(generalGreeting + customer2); // Displays "Welcome to Cafe Java, Sam"
        System.out.println(isReadyOrder2 ? customer2 + readyMessage : customer2 + pendingMessage);
        if (isReadyOrder2) {
            System.out.println(displayTotalMessage + (2 *lattePrice));
        }

        System.out.println(generalGreeting + customer3); // Displays "Welcome to Cafe Java, Jimmy"
        System.out.println("Your new total is $" + lattePrice);
        System.out.println("You currently owe $" + (lattePrice - dripCoffeePrice));

    }
}
