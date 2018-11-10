package staticdemo;

public class StaticDemo {

           public static void main(String[] args) {

            StaticDemoSetup sd = new StaticDemoSetup();

            System.out.println(sd.message);
            sd.displayMessage();

            System.out.println(StaticDemoSetup.greetings);
            StaticDemoSetup.displayGreetings();
        }//end of psvm

}//end of class
