import java.util.HashMap;
import java.util.Map;

public class DistinctCharactersCount {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : inputString.toCharArray()) {
    
            if (Character.isLetter(c)) {
                char lowercaseChar = Character.toLowerCase(c);

                charCountMap.put(lowercaseChar, charCountMap.getOrDefault(lowercaseChar, 0) + 1);
            }
        }

 
        System.out.println("Distinct characters and their counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
