package Array.twoDarray;

public class spiralPrint {
    public static void printSpiral(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endCol = arr.length-1;
        int endRow = arr.length-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(arr[startRow][j]+" ");
            }

            //rigth
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(arr[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1; i>startRow; i--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(arr[i][startRow]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4,10},
                      {5,6,7,8,20}, 
                      {10,11,12,13,30},
                      {14,15,16,17,40},
                    {50,60,70,80,90}};
        printSpiral(matrix);
    }
}
