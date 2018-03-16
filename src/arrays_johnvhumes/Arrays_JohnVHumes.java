/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_johnvhumes;

/**
 *
 * @author Euthyphro
 */
public class Arrays_JohnVHumes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] sortArray = {1,2,3,4,6,2};
        double [] roundArray = {2.0,2.001,2.1,2.6,3.1};
        int numTriNums=7;
        int[] testGap={-1,1,3,5,7,9};
        String palindromeCandidate="toot";
        String[] beatles= new String[]{"larry", "curly","moe","shemp","bono"};
   
        System.out.print("for array");
        for (int i=0; i<sortArray.length; i++){
           System.out.print(" "+sortArray[i]);
        }
        System.out.println("\nisSorted(sortArray)="+isSorted(sortArray));
        
        System.out.print("for array ");
        for (int i=0; i<roundArray.length; i++){
           System.out.print(" "+roundArray[i]);
        }
        System.out.print(" the result of roundAllUp(roundArray) is");                

        int[] roundedArray = roundAllUp(roundArray);
        
        for (int i=0; i<roundedArray.length; i++){
           System.out.print(" "+roundedArray[i]);
        }
        System.out.print("\ngenerating "+ numTriNums+ " triangle numbers:");
        int[] triangleNumbers=generateTriangleNumbers(7);
        
        for (int i=0; i<triangleNumbers.length;i++)
        {
            System.out.print(triangleNumbers[i]);
            if (i<triangleNumbers.length-1)
            {
                System.out.print(", ");
            }
        }
        // TODO code application logic here
        

        System.out.println("\nReversing the strings: ");
        

                for (String member:beatles)
        {
            System.out.println(member);
        }
        
        
        reverseAll(beatles);
        System.out.println("Yields:");
        for (String member:beatles)
        {
            System.out.println(member);
        }
        
        System.out.println("it is "+ isPalindrome(palindromeCandidate) + " that "+ palindromeCandidate+" is a palindrome");
        
        System.out.println("the minimum gap in the testGap array is "+ minGap(testGap));
        

        
    }
    
    
    
    public static boolean isSorted (int[] intArray)
    {
        boolean sorted = false;
        for (int pos = 0; pos < (intArray.length)-1; pos++){
            if (intArray[pos] <= intArray[pos+1]){
                sorted = true;
            }
            
            else{
                return false;
            }
        }
        return sorted;
    }
    
    public static int[] roundAllUp(double[] doubleArray)
    {
        int[] roundedUp=new int[doubleArray.length];
        for (int pos = 0; pos < doubleArray.length; pos++){
            
            if (doubleArray[pos]-(int)doubleArray[pos]>0){
            roundedUp[pos]=(int) (doubleArray[pos]+1);
            }
            
            else{
                roundedUp[pos]=(int)doubleArray[pos];
            }
        }
        return roundedUp;
    }
    
    public static int[] generateTriangleNumbers(int x)
    {
        int triangleNum;
        int [] triArray = new int[x];
        for (int index = 0; index < x; index++){
            triangleNum=0;
            for (int triLen=0; triLen<=index; triLen++){
                triangleNum+=(triLen+1);
            }
            triArray[index]=triangleNum;
            
        }
        
       return triArray;
    }
    
    public static void reverseAll(String[] stringArray)
    {
        char temp;
        for (int j=0; j<stringArray.length; j++) {
            char[] workingChars = stringArray[j].toCharArray();
            for(int i=0; i<(workingChars.length)/2;i++)
            {
                int wordLength=workingChars.length;
                temp=workingChars[(wordLength-1)-i];
                workingChars[(wordLength-1)-i]=workingChars[i];
                workingChars[i]=temp;
            }
            stringArray[j]=String.valueOf(workingChars);
        }
        
    }
    
    public static boolean isPalindrome(String word)
    {
        char temp;
            char[] workingChars = word.toCharArray();
            for(int i=0; i<(workingChars.length)/2;i++)
            {
                int wordLength=workingChars.length;
                temp=workingChars[(wordLength-1)-i];
                workingChars[(wordLength-1)-i]=workingChars[i];
                workingChars[i]=temp;
            }
            String reversedString=String.valueOf(workingChars);
        if (reversedString.equalsIgnoreCase(word))
                {
                    return true;
                }
        return false;
    }
   
    public static int minGap(int[] intArray)
    {
        int minGap =2147483647;
        for (int index = 0; index < intArray.length-1; index++)
        {
            if (intArray[index+1]-intArray[index]<=minGap)
            {
                minGap=intArray[index+1]-intArray[index];
            }
           
        }
        return minGap;
    }

    
}

 