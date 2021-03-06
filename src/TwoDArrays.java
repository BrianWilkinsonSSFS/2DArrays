public class TwoDArrays {

    public static int sumAll(int[][] arr) {
        int total = 0;
        for (int row=0; row<arr.length; row++) {
            for (int col=0; col<arr[0].length; col++) {
                total += arr[row][col];
            }
        }
        return total;
    }

    public static boolean isSquare(int[][] arr) {

        for (int row=0; row<arr.length; row++) {
            if (arr[row].length != arr.length)
                return false;
        }
        return true;
    }

    public static int maxValue(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row=0; row<arr.length; row++) {
            for (int col=0; col<arr[0].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
