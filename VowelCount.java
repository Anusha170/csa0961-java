public class VowelCount {
    public static void main(String[] args) {

        String inputStatement = "SIMATS ENGINEERING";

        int vowelCount = countVowels(inputStatement);

        System.out.println("Number of vowels = " + vowelCount);
    }
    
    public static int countVowels(String statement) {
        int count = 0;
       
        statement = statement.toLowerCase();
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
