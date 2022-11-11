public class sort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,6,7,9,5,1};
        int[] arr1 = new int[]{30,21,64,72,96,54,15};
        int[] arr2 = new int[]{48,37,19,34,56,24,1};
        bubbleSort(arr);
        printarr(arr);
        insertionsort(arr1);
        printarr(arr1);
        selectionsort(arr2);
        printarr(arr2);
    }

    private static void printarr(int[] arr) {
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] arr) {
        boolean isSwapped;
        for(int i=0; i<arr.length-1;i++){
            isSwapped = false;
            for(int j=0;j<arr.length-1-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    isSwapped = true;
                }
            }
            if(isSwapped == false) break;
        }
            
            }
            public static void insertionsort(int[] arr) {
                int n = arr.length;
        
                for(int i = 1; i < n; i++) { // unsorted part
                    int temp = arr[i];
                    int j = i - 1; // sorted part
        
                    while(j >= 0 && arr[j] > temp) {
                        arr[j + 1] = arr[j]; // shifting larger elements to temp by 1 pos
                        j = j - 1;
                    }
                    arr[j + 1] = temp;
                }
            }
            public static void selectionsort(int[] arr) {
                int n = arr.length;
                for(int i = 0; i < n - 1; i++){
                    int min = i;
                    for(int j = i + 1; j < n; j++){
                        if(arr[j] < arr[min]){
                            min = j;
                        }
                    }
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        
        }