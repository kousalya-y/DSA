import org.w3c.dom.Attr;

public class findELinmatrix {


    public static void main(String[] args) {
        int[][] arr = new int[][]{{10,20,30,40},
                               {15,25,35,45},
                            {27,29,37,48},
                        {32,33,39,51}};
                        findKey(arr,32);
                        printSpiral(arr, 4,4);

        }
        private static void printSpiral(int[][] arr, int r, int c) {
            int i, k = 0, l = 0;
            while(k<r && l < c){

                for(i = l;i < c; i++){ //left to right
                    System.out.print(arr[k][i]+" ");
                }
                k++;
                for(i = k; i<r;i++){ //top to bottom
                    System.out.print(arr[i][c-1]+" ");
                }
                c--;
                if(k<r){
                    for(i=c-1;i>=l;i--){ //right to left
                        System.out.print(arr[r-1][i]+" ");
                    }
                    r--;
                }
                if(l<c){
                    for(i = r-1;i>=k;i--){ //bottom to top
                        System.out.print(arr[i][l]+" ");
                    }
                    l++;
                }
            }
    }

        public static void findKey(int[][] arr1,int key){
            int i=0;
            int j=arr1.length - 1;
            while(i < arr1.length && j >= 0){
                if(arr1[i][j] ==  key){
                    System.out.println("Key found");return;
                }
                if(arr1[i][j] > key){
                     j--;
                }
                else{
                    i++;
                }
            }
            System.out.println("Key not found");
        }
    
}
