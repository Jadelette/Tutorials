package interfacedemo;

public interface MyInterface {

    int myInt = 5; //inherently public, static and final
    void someMethod(); //inherently abstract

    public static void someStaticMethod() {
        System.out.println("This is a static method in an interface");
    }//end of static method

    public default void someDefaultMethod() {
        System.out.println("This is a default method in an interface");
    } //end of default method
}
