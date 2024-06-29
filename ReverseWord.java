public class ReverseWord {
    public static void main(String[] args) {

        String inputWord = "ANIMEL";
   
        String outputWord = reverseWord(inputWord);
        
        System.out.println("String: " + inputWord);
        System.out.println("Reverse String: " + outputWord);
    }
    
    public static String reverseWord(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }
}
