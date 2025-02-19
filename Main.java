public class Main {
    public static String compress(String input)
    {
        int repeat = 1;
        String answer = "";

        if (input.equals(""))
        {
            return input;
        }

        for (int i = 0; i < input.length() - 1; i++)
        {
            if (input.charAt(i) == input.charAt(i + 1))
            {
                repeat++;
            }
            else
            {
                answer += input.charAt(i);
                answer += String.valueOf(repeat);
                repeat = 1;
            }
        }
        answer += input.charAt(input.length() - 1);
        answer += String.valueOf(repeat);
        return answer;
    }
    public static void main(String[] args)
    {
        System.out.println(compress("aabcccccaaa"));
    }
}
