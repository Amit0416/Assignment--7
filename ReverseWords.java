public class ReverseWords {
        public static String reverseWords(String s) {
            StringBuilder result = new StringBuilder();
            String[] words = s.split(" ");
    
            for (String word : words) {
                StringBuilder reversedWord = new StringBuilder(word);
                reversedWord.reverse();
                result.append(reversedWord).append(" ");
            }
    
            // Remove the extra whitespace at the end
            result.setLength(result.length() - 1);
    
            return result.toString();
        }
    
        public static void main(String[] args) {
            String s = "Let's take LeetCode contest";
            String reversed = reverseWords(s);
            System.out.println("Reversed: " + reversed);
    }
}
