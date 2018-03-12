public class WordBreak {

    int numWords = 15;
    //String wordsRaw = "mobile,samsung,sam,sung,man,mango,icecream,and,go,i,like,ice,cream";
    String wordsRaw = "i,ilike";
    String[] words = wordsRaw.split(",");
    public int canBreakWords(String sequence){
        int firstChar=0,lastChar=0;
        int charCount = 0;
        int seqLen = sequence.length();
        while(lastChar < seqLen){
            int i = lastChar;
            for(int j=firstChar; j<=i+14; j++){
                if(j>=sequence.length()){
                    return 0;
                }
                String str = sequence.substring(i,j+1);
                if(containsWord(str)){
                    System.out.println(str);
                    charCount = charCount + str.length();
                    firstChar=j+1;
                    lastChar=j+1;
                    break;
                }
            }
        }
        if(charCount == sequence.length())
            return 1;
        return 0;
    }

    public boolean containsWord(String word){
        for(int i=0; i<words.length; i++){
            if(words[i].equalsIgnoreCase(word)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        String inputSequence = "ilike";
        WordBreak wordBreak = new WordBreak();
        System.out.println(wordBreak.canBreakWords(inputSequence));

    }



}
