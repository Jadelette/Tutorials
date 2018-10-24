import java.util.Arrays;

public class MyArrays {

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

        System.out.println();
        //adds space between results


        int[] arr1 = {0,2,4,6,8,10};
        int[] arr2 = {0,2,4,6,8,10};
        int[] arr3 = {10,8,6,4,2,0};
        int[] arr4 = {12,1,5,-2,16,14};
        char[] arr5 = {'d','a','y','m','x','c'};
        String[] arr6 = {"cat", "banana", "dog", "apple", "whale", "tiger"};

        boolean result1 = Arrays.equals(arr1, arr2);
        boolean result2 = Arrays.equals(arr2, arr3);

        System.out.println(result1);
        System.out.println(result2);

        System.out.println();
        //adds space only

        int[] dest = Arrays.copyOfRange(arr3,2,5);
        for (int item : dest) {
            System.out.println(item);
        }

        System.out.println();
        //adds space only

        String arr1String = Arrays.toString(arr1);
        System.out.println("Your array contains the following values: " + arr1String);

        System.out.println();
        //adds space only

        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println(Arrays.toString(arr5));
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));

        System.out.println(Arrays.toString(arr6));
        Arrays.sort(arr6);
        System.out.println(Arrays.toString(arr6));

        System.out.println();
        //adds space only

        int foundInt =  Arrays.binarySearch(arr4, 5);
        int foundIntValue = arr4[foundInt];
        System.out.println(foundIntValue + " is at index: " + foundInt);

        int foundChar =  Arrays.binarySearch(arr5, 'y');
        Character foundCharValue = arr5[foundChar];
        System.out.println(foundCharValue  + " is at index: " + foundChar);

        int foundString =  Arrays.binarySearch(arr6, "tiger");
        String foundStringValue = arr6[foundString];
        System.out.println(foundStringValue + " is at index: " + foundString);





    }
}
