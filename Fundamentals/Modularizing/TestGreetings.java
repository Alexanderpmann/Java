public class TestGreetings {
    public static void main(String[] args) {

        Greetings greeterApp = new Greetings();

        String dateMessage = greeterApp.getCurrentDate(); //using dot notation
        System.out.println(dateMessage);

    }    
}
