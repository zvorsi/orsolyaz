package GreatestValuesInMatrices;

public class GreatestValuesInMatrices {

    public static int[][] greatestValues(int[][] a, int[][] b){
        int[][] result = new int[a.length][a.length];

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length ; j++) {
                if (a[i][j] > b[i][j]){
                    result[i][j] = a[i][j];
                }else{
                    result[i][j] = b[i][j];
                }
            }
        }
        return result;
    }
}
