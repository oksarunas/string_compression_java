import java.util.Scanner;
public class Main {
    public static String compress(String input)
    {
        StringBuilder answer = new StringBuilder();
        int repeat = 1;

        if (input.equals(""))
        {
            return input;
        }
        // Iterate through the string, checking consecutive characters
        for (int i = 0; i < input.length() - 1; i++)
        {
            if (input.charAt(i) == input.charAt(i + 1))
            {
                repeat++; // Increase count if the next character is the same
            }
            else
            {
                // Append the character and its count to the result
                answer.append(input.charAt(i));
                answer.append(repeat);
                repeat = 1; // Reset count for the next character
            }
        }
        // Append the last character and its count
        answer.append(input.charAt(input.length() - 1));
        answer.append(repeat);
        return answer.toString();
    }


    public static String decompress(String input)
    {
        StringBuilder decompressed = new StringBuilder();

        // Iterate through the string, reconstructing it
        for (int i = 0; i < input.length(); i++)
        {
            if (Character.isLetter(input.charAt(i)))
            {
                decompressed.append(input.charAt(i)); // Append letter to decompressed string
            }
            else
            {
                // Repeat the last letter based on the numeric value
                for (int z = 1; z <  Character.getNumericValue(input.charAt(i)); z++)
                {
                    decompressed.append(input.charAt(i - 1)); // Append last letter multiple times
                }
            }
        }
        return decompressed.toString(); // Convert StringBuilder to String and return
    }

public static void main(String[] args) {
    
    //Get user input
    Scanner scanner = new Scanner(System.in); 
    
    
    System.out.print("Enter a string to compress: ");
    String input = scanner.nextLine(); // Read user input

    //Print out user input
    System.out.println("Input: " + input);

    String compressed = compress(input); // Store the compressed result
    System.out.println("Compressed: " + compressed);

    String decompressed = decompress(compressed); // Use the compressed result for decompression
    System.out.println("Decompressed: " + decompressed);
}
}
