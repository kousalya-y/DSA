public class quickSort {
    static int[] arr1 = new int[]{4,6,2,5,7,9,1,3};
    public static void main(String[] args) {
        printarr(arr1);
        quicksort(0,7);
        printarr(arr1);
    }

    private static void quicksort(int low, int high) {
        if(low < high){
        int pivot = partition(low, high);
        quicksort(low, pivot-1);
        quicksort(pivot+1, high);
        }
    }

    private static int partition(int low, int high) {
        int i = low,j = high;
        int pivot = arr1[low];
        while(i < j){
            while(arr1[i] <= arr1[low]){
                i++;
            }
            while(arr1[j] > arr1[low]){
                j--;
            }
            if(i < j)
            {
            swap(i,j);
            }
        }
            swap(j,low);
        return j;
    }

    private static void swap(int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = temp;
    }

    private static void printarr(int[] arr) {
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
