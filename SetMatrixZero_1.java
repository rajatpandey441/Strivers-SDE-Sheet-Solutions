public class SetMatrixZero_1 {
    public static void handleArray(int[][] inpArray){
        int rows = inpArray.length;
        int cols = inpArray[0].length;
        int[] dummyRows = new int[rows];
        int[] dummyCols = new int[cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(inpArray[i][j] == 0){
                    dummyRows[i] = -1;
                    dummyCols[j] = -1;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(dummyRows[i] == -1 || dummyCols[j] == -1){
                    inpArray[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        handleArray(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }

    }
}
