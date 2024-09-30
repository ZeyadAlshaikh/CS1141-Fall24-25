package Tutorials.Tutorial_8.Starter;

public class IdentityMatrix {

    public static int [][] generateDiagonalMatrix(int[] diagonal) {
        int diagonalMatrix[][] = new int[diagonal.length][diagonal.length];
        for (int i = 0; i < diagonal.length; diagonalMatrix[i][i] = diagonal[i], i++);
        //diagonalMatrix[diagonal.length-1][0] = 5;
        return diagonalMatrix;
    }
//todo: handel non-diagonal matrix by using assertion
    public static boolean isIdentity(int diagonalMatrix[][]) {
        for (int i = 0; i < diagonalMatrix.length; i++) {
            for (int j = 0; j < diagonalMatrix[i].length; j++) {
                if(i == j) {
                    if (diagonalMatrix[i][j] != 1)
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int [] a1 = {1,4,8,6,4};
        int [] a2 = {1,1,1,1,1,1};
        if (!isIdentity(generateDiagonalMatrix(a1)))
            System.out.println("a1 is not an identity matrix");
        if (isIdentity(generateDiagonalMatrix(a2)))
            System.out.println("a2 is an identity matrix");
    }
}
