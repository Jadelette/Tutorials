package staticdemo;

public class StaticDemoSetup {

    //non-static field and method
    public String message = "Hello, World";
    public void displayMessage()
    {
        System.out.println("Message: " + message);
    }//end of method

    //static field and method
    public static String greetings = "Good morning";
    public static void displayGreetings()
    {
        System.out.println("Greeting: " + greetings);
    }//end of method
}//end of class

