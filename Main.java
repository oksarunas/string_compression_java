public class Main {
    public static String compress(String input)
    {
        int repeat = 1;
        String answer = "";

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
                answer += input.charAt(i);
                answer += String.valueOf(repeat);
                repeat = 1; // Reset count for the next character
            }
        }
        // Append the last character and its count
        answer += input.charAt(input.length() - 1);
        answer += String.valueOf(repeat);
        return answer;
    }
    public static void main(String[] args)
    {
        // Test the compress method with an example input
        System.out.println(compress("aabcccccaaa"));
    }
}
