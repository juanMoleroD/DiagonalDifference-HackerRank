import java.util.List;

public class Application {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int matrixSize = arr.get(0).get(0);

        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;

        for (int i = 0; i < matrixSize; i++) {
            sumFirstDiagonal+= arr.get(i+1).get(i);
            sumSecondDiagonal+= arr.get(i+1).get((matrixSize-1) - i);
        }

        return Math.abs(sumFirstDiagonal)-Math.abs(sumSecondDiagonal);
    }

}
