public class SetMatrixZero{
    public static void handleArray(int[][] inpArray){
        boolean col=true;
        int rows = inpArray.length;
        int cols = inpArray[0].length;
        for(int i=0;i<rows;i++){
            if(inpArray[i][0] == 0)
                col=false;
            for(int j=1;j<cols;j++){
                if(inpArray[i][j] == 0){
                    inpArray[0][j] = 0;
                    inpArray[i][0] = 0;
                }
            }
        }
        for(int i = rows-1;i>=0;i--){
            for(int j = cols-1;j>=0;j--){
                if(inpArray[i][0] == 0 || inpArray[0][j] == 0){
                    inpArray[i][j] = 0;
                }
                if(i==0 && j==0 && col==false){
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