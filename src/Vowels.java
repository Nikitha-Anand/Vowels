import java.util.Arrays;

public class Vowels {
    public static Integer IterativeVowels(String Value){
        Integer Total = 0;
        Integer LengthString = Value.length();
        Character FirstCharacter;
        char[] CharArray;
        CharArray = Value.toCharArray();
        for (int X = 0; X < LengthString; X++) {
            FirstCharacter = CharArray[X];
            if(FirstCharacter == 'a' || FirstCharacter == 'e' || FirstCharacter == 'i' || FirstCharacter == 'o' || FirstCharacter == 'u'){
                Total = Total + 1;
            }
        }
        return Total;
    }

    public static Integer Total = 0;
    public static Integer RecursiveVowels(String Value){
        Integer LengthString = Value.length();
        Character FirstCharacter;
        char[] CharArray = new char[LengthString];
        CharArray = Value.toCharArray();
        FirstCharacter = CharArray[0];
        if(FirstCharacter == 'a' || FirstCharacter == 'e' || FirstCharacter == 'i' || FirstCharacter == 'o' || FirstCharacter == 'u'){
            Total = Total + 1;
        }
        if(LengthString > 1){
            String newString = String.copyValueOf(CharArray,1,LengthString - 1);
            RecursiveVowels(newString);
        }
        return Total;
    }
    public static void main(String[] args){
        System.out.println("Number of Vowels in imagine: " +RecursiveVowels("imagine"));
    }
}
