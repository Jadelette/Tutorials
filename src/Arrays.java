public class Arrays {

    public static void main(String[] args) {

        float[] theVals = /*new float[3]*/ {10.0f, 20.0f, 15.0f};
        //the square brackets indicate that I am declaring 'theVals' as an array
        /*theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 15.0f;
        the above notation would be used with the commented out section in the line where the new array object is
        declared. In this case - the three values to be stored in the array would not be listed on the same line.
        */

        float sum = 0.0f;
        float sum2 = 0.0f;

//Example for loop to iterate over array

        for (int i = 0; i < theVals.length; i++) {
            sum += theVals[i];

            System.out.println(sum);

        }


        System.out.println();
        //the above is used to put a space between the output of the two loops

// Example for each loop to iterate over array
        for (float currentVal : theVals) {
            //// for every float that we will call 'currentVal' in the array called 'theVals'
            sum2 += currentVal;

            System.out.println(sum2);
        }

        System.out.println("Blablabla");



    }
}
