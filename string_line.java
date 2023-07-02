public class string_line {
    public static boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        // Calculate the slope between the first two points
        int deltaX = x1 - x0;
        int deltaY = y1 - y0;

        // Iterate over the remaining points and compare the slopes
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            // Calculate the slope between the current point and the first point
            int currentDeltaX = x - x0;
            int currentDeltaY = y - y0;

            // If the slopes are not equal, return false
            if (deltaX * currentDeltaY != deltaY * currentDeltaX) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        boolean isStraightLine = checkStraightLine(coordinates);
        System.out.println("Points form a straight line: " + isStraightLine);
    }
}

