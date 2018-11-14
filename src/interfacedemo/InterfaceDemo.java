package interfacedemo;

public class InterfaceDemo {

    public static void main(String[] args) {
        MyClass a = new MyClass();
        a.someMethod();

        System.out.println("The value of the constant is " + MyInterface.myInt);
        //constants in interfaces are static, so implement using name of interface rather thsn the class/object name

        a.someDefaultMethod();
        MyInterface.someStaticMethod();

    }
}
