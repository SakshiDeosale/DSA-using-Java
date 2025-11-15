//Print the number of 7’s that are inthe 2d array.
//Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2

package Array.twoDarray;

// public class Assignment {
//     public static int SearchCount(int arr[][], int key){
//         int count = 0;
//         int n = arr.length, m =arr[0].length;

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(arr[i][j] == key){
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }
//      public static void main(String[] args) {
//         int array[][] = { {4,7,8},{8,8,7} };
//         int key=7;
        
//         System.err.println("Number of "+key+" are="+SearchCount(array, key));
//      }     
// }


//Print out the sum of the numbers inthe second row of the “nums” array.
//Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18

// public class Assignment {

//     public static int sumOfSecondRow(int arr[][]) {
//         int sum=0, row = 1;
//         for(int i=0; i<arr[0].length; i++){
//               sum += arr[row][i];
//         } 
//         return sum;
//     }
//     public static void main(String[] args) {
//         int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//         System.out.println("Sum="+sumOfSecondRow(nums));
//     }
// }


//transpose of matrix

public class Assignment {

    public static void transpose(int arr[][]){
        int row = arr.length, col = arr[0].length;
        System .out.println(row+" "+col);

        int transpose[][] = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = arr[i][j];
            }
        }

        //print original matrix
        System.out.println("Original Matrix");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //print transpose matrix
        System.out.println("Transpose Matrix");
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{6,7,8}};
        transpose(nums);
    }
}


