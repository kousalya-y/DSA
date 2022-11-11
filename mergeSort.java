public class mergeSort {
    
    
    static int[] arr = new int[]{3,2,6,7,9,5,1};
    public static void main(String[] args) {
        
      //  int[] arr1 = new int[]{30,21,64,72,96,54,15};
        //int[] arr2 = new int[]{48,37,19,34,56,24,1};
        mergeSort1(0,arr.length-1);
        printarr(arr);
    }
    private static void mergeSort1(int low, int high){
        if(low < high){
            int mid = (low+high)/2;
            mergeSort1(low, mid);
            mergeSort1(mid+1, high);
            merge(low,mid,high);
        }

        }
    private static void merge(int low, int mid, int high) {
        int i = low;
        int j = mid+1;
        int k = low;
        int[] temp = new int[arr.length];
        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        if(i > mid){
            while(j <= high){
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        else{
        while(i <= mid){
            temp[k] = arr[i];
            k++;
            i++;
        }
    }
        
      for(int w = low; w <= high; w++ ){
        arr[w] = temp[w];
      }
    }

    private static void printarr(int[] arr) {
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
