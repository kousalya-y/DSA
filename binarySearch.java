public class binarySearch {
    public static void main(String[] args) {
    int[] arr = new int[]{1,10,20,47,59,65,75,88,99};
    binarysearch(arr, 9, 105);
   int pos = insertPos(arr, 9, 69);
   System.out.println("can be inserted at "+ pos);
    }


    private static int insertPos(int[] arr, int len, int j) {
        int low = 0;
        int high = len-1;
        while(low <= high){
        int mid = low +(high-low)/2;
        if(arr[mid]==j){
            return mid;
        }
        if(j < arr[mid]){
            high = mid-1;
        }
        else if(j > arr[mid]){
            low = mid+1;
        }
    }
    return low;
    }

    private static void binarysearch(int[] arr, int len, int i) {
        int low = 0;
        int high = len-1;
        while(low <= high){
        int mid = high+low/2;
        if(arr[mid]==i){
            System.out.println("pos: "+ mid);
            return;
        }
        if(i < arr[mid]){
            high = mid-1;
        }
        else if(i > arr[mid]){
            low = mid+1;
        }
    }
    System.out.println("not found");
    }
    
}
