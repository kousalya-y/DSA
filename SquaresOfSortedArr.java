public class SquaresOfSortedArr {
    static int[] arr = new int[]{-4,-1,0,3,10};
    static int[] b = new int[arr.length];
    public static void main(String[] args) {
        sortedSquares();
        printArr(b);
    }
    
    private static void sortedSquares() {
        int n = arr.length;
        int i = 0,j=n-1;
        for(int k = n-1;k>=0;k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                b[k] = arr[i] * arr[i];
                i++;
            }
            else{
                b[k] = arr[j] * arr[j];
                j--;
            }
        }
    }

    private static void printArr(int[] a) {
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}
