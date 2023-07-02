public class revers_substring {
    public static String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        for (int i = 0; i < n; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1); // Ensure end index is within bounds

            // Reverse the first k characters
            while (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }

        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String reversed = reverseStr(s, k);
        System.out.println("Reversed: " + reversed);
    }
}
