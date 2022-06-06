public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES

        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 3;
        double lattePrice = 4;
        double cappuccinoPrice = 4.5;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)

        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"

        // ** Your customer interaction print statements will go here ** //
        // 1 - Cindhuri ordered a coffee.
        // - show her the status message
        System.out.println(customer1 + pendingMessage);

        // 2 - Noah ordered a cappucino
        // check the status of his order and let him know. If ready -> give total
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        // 3 - Sam ordered 2 lattes, and wants to know total cost up front
        // Tell status of order
        System.out.println(displayTotalMessage + lattePrice * 2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // 4 - Jimmy was charged a coffee but ordered a latte
        // tell Jimmy his new total to make up the difference
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}
