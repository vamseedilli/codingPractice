import java.util.Arrays;

public class ReOrgString {

    public String sortString(String inputString){
        char[] charArr = inputString.toCharArray();
        Arrays.sort(charArr);
        String sortedInput = new String(charArr);
        return sortedInput;
    }

    public String reorganizeString(String inputString){
        int length = inputString.length();
        int i=1;
        while(i<length-1){
            if(inputString.charAt(i)==inputString.charAt(i-1)||inputString.charAt(i)==inputString.charAt(i+1)){

            }
        }
    }

    public static void main(String[] args) {

    }
}
