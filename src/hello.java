public class hello {

    public static void main(String[] args) {
        System.out.println("hello world");

        int myVariable = "hello world".length();
        System.out.println(myVariable);

        String bigWorld = "hello world".toUpperCase();
        System.out.println(bigWorld);

        String smallWorld = bigWorld.toLowerCase();
        System.out.println(smallWorld);

        String hi = smallWorld.substring(0, 5);
        System.out.println(hi);

        String justWorld = smallWorld.substring(6);
        System.out.println(justWorld);

        char firstWorld = smallWorld.charAt(6);
        System.out.println(firstWorld);

        boolean compWorlds = smallWorld.equals(bigWorld);
        System.out.println(compWorlds);

        boolean compWorlds2 = smallWorld.equals("hello world");
        System.out.println(compWorlds2);

        //smallWorld = "hello, world";

        String[] splitWorld = smallWorld.split(" ");
        for (String part : splitWorld){
        System.out.println(part);}


    }
}
