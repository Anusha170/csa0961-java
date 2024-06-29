import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to be searched: ");
        char searchChar = scanner.next().charAt(0);

        int index = searchCharacter(inputString, searchChar);
        if (index != -1) {
            System.out.println(searchChar + " is found in string at index: " + index);
        } else {
            System.out.println(searchChar + " is not found in the string.");
        }

    }

    public static int searchCharacter(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1; 
    }
}
