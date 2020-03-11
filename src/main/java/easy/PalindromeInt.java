package easy;

public class PalindromeInt {

    public boolean isPalindrome(int x){
        double[] result = reverseInt(x);
        return result[0] == x;
    }

    private double[] reverseInt(int x){
        if(x<10){
            return new double[]{x, 0};
        }else{
            double[] val = reverseInt(x/10);
            val[1] = ++val[1];
            double currVal = (x%10 * Math.pow(10, val[1]));
            val[0] = val[0] + currVal;
            return val;
        }
    }
}
