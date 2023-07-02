public class ShiftString {
    public static boolean canShift(String s, String goal) {
        if (s.length() != goal.length()) {
            return false; // Different lengths, can't be transformed
        }

        String concatenated = s + s;
        return concatenated.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "bcdea";
        boolean canTransform = canShift(s, goal);
        System.out.println("Can transform: " + canTransform);
    }
}
