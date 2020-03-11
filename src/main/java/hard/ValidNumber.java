package hard;

public class ValidNumber {

    public boolean isNumber(String s){
        return isNumber(s, false);
    }


    protected boolean isNumber(String s, boolean isExponent){
        boolean seenDecimalPoint = false;
        //If evaluating for exponent then a non white space character has appeared before, otherwhys non have
        boolean seenNonWhiteSpace = isExponent;

        if(s.length() == 0)
            return false;


        int i = getIndexOfFirstNonWhiteSpace(s);
        if(i == -1)
            return false;
        char firstChar = s.charAt(i);

        if(s.length()==1 && !isDigit(firstChar))
            return false;
        else if(firstChar == 'e')
            return false;
        else if(firstChar == '+' || firstChar == '-') {
            if(s.charAt(i+1) == ' ' || s.charAt(i+1) == 'e')
                return false;
            i++;
        }

        for(;i<s.length();i++){
            char c = s.charAt(i);

            if(c == '.'){
                if(seenDecimalPoint)
                    return false;
                else if(isExponent)
                    return false;
                else if(isLastIndex(s, i) && !seenNonWhiteSpace)
                    return false;
                else if(!isLastIndex(s, i) && !seenNonWhiteSpace && !isDigit(s.charAt(i+1)))
                    return false;
                else if(seenNonWhiteSpace && onlyWhiteSpaceRemains(s, i+1))
                    return true;
                seenDecimalPoint = true;
                continue;
            }else if(c == 'e') {
                if (isExponent || isLastIndex(s, i) || s.charAt(++i) == ' ')
                    return false;
                if(!seenNonWhiteSpace)
                    return false;
                return isNumber(s.substring(i), true);
            }else if(c == ' '){
                if(isLastIndex(s, i) && !seenNonWhiteSpace)
                    return false;
                else if(seenNonWhiteSpace)
                    return onlyWhiteSpaceRemains(s, i+1);
                continue;
            }else if(isDigit(c)) {
                seenNonWhiteSpace = true;
                continue;
            }
            return false;
        }
        //If fully evaluated string and did not return otherwhys then the string is a number
        return true;
    }


    private boolean onlyWhiteSpaceRemains(String s, int currIndex){
        for(;currIndex<s.length(); currIndex++){
            if(s.charAt(currIndex) != ' ')
                return false;
        }
        return true;
    }

    private boolean isDigit(char c){
        return c >= '0' && c <= '9';
    }

    private boolean isLastIndex(String s, int index){
        return s.length() == index + 1;
    }

    private int getIndexOfFirstNonWhiteSpace(String s){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ' ')
                return i;
        }
        return -1;
    }
}
