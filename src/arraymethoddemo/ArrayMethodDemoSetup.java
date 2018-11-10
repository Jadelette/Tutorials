package arraymethoddemo;

import java.util.Arrays;

 class ArrayMethodDemoSetup {

    public void printFirstElement(int[] a)
    {
        System.out.println("The first element is: " + a[0]);
    }//end of method

    public int[] returnArray()
    {
        int[] a = new int[3];
        for (int i=0; i<a.length; i++)
        {
            a[i] = i*2;
        }//end of for loop

        return a;
    }//end of method


     //examples of passing primitive and reference data types parameters
     public void passPrimitive(int primPara)
     {
         primPara = 10;
         System.out.println("Value inside method = " + primPara);
     }//end of method

     public void passRef(int[] refPara)
     {
         refPara[1] = 5;
         System.out.println("vlaue inside method = " + refPara[1]);
     }//end of method
} //end of class
