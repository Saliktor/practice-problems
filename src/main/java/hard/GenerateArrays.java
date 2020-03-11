package hard;

public class GenerateArrays {
    public static final boolean DEBUG = false;

    /**
     * Calculates the total amount of possible arrays for a given size where the array must meet the following requirements:
     * - The numbers in the array must be between 1 to maxValue
     * - The possible array "a" must have element a[i+1] be divisible a[i] ~ a[i+1]%a[i}==0
     *
     * @param maxValue the maximum int that can exist in array
     * @param arraySize size of arrays
     * @return total possible amount of arrays that can be generated
     */
    public int numberOfArrays(int maxValue, int arraySize){

        if(arraySize == 1)
            return maxValue;

        int totalPossibleArrays = 0;
        for(int i = 1; i<=maxValue; i++)
            totalPossibleArrays += numberOfArraysForValue(maxValue, arraySize, i, 1);
        return totalPossibleArrays;
    }

    /**
     * Recursive method that will generate number of possible arrays for maxArraySize
     *
     * @param maxValue maximum int that can exist in array
     * @param maxArraySize array size calculating total for
     * @param val current int to calculate how many divisible values can follow and fit in array
     * @param currArraySize what element in the "array" being generated that val resides at
     * @return total number of arrays that could be generated for the val
     */
    protected int numberOfArraysForValue(int maxValue, int maxArraySize, int val, int currArraySize){
        int[] possibleValues = generateAllPossibleDivisbleNumbers(maxValue, val);
        int totalPossibleArrays = 0;
        if(currArraySize == maxArraySize-1){
            return possibleValues.length;
        }else{
            for(int i = 0; i<possibleValues.length; i++){
                totalPossibleArrays += numberOfArraysForValue(maxValue, maxArraySize, possibleValues[i], currArraySize + 1);
            }
            return totalPossibleArrays;
        }

    }

    /**
     * Generates array of all possible integers that are divisible by value up to maxValue
     *
     * @param maxValue largest value possible
     * @param startVal int representing number all ints in return array must be divisible by
     * @return array of ints divisible by startVal
     */
    private int[] generateAllPossibleDivisbleNumbers(int maxValue, int startVal){
        int[] arr = new int[maxValue/startVal];
        int i = 0;
        int currVal = startVal;

        do{
            arr[i++] = currVal;
            currVal += startVal;
        }while(currVal <= maxValue);


        if(DEBUG)
            System.out.println("Max Value: " + maxValue + ", startVal: " + startVal + ", arrSize: " + arr.length);

        return arr;
    }

}
