
public class Matrix {
    
    public static int[][] setRandomMatrix(){
        int[][] matrix = new int[4][4];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                matrix[i][j] = (int)((Math.random()) * 2);   //若随机数在 (0-0.5) 生成0 在 (0.5,1) 生成1
            }
        }
        return matrix;
    }
    public static void showMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    public static void findMax1(int[][] matrix){
        int maxRow = 0;//最大行
        int maxCol = 0;//最大列
        int row = 0;
        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            int numRow = 0;
            int numCol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    numRow++;
                }
                if (matrix[j][i] == 1) {
                    numCol++;
                }
            }
            if (numRow > maxRow) {
            maxRow = numRow;
            row = i;
            }
            if (numCol > maxCol) {
            maxCol = numCol;
            col = i;
            }
        }
        System.out.println("含最多1的行:" + (row + 1));
        System.out.println("含最多1的列:" + (col + 1));
    }
    public static void main(String[] args){
        int[][] matrix = new int[4][4];
        matrix = setRandomMatrix();
        showMatrix(matrix);
        findMax1(matrix);
    }
}