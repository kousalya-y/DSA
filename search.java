public class search {
    public static void main(String[] args) {
        int[] arr = new int[]{1,34,56,67,45,90,23,45,66,67};
        searchEl(arr,100);

    }

    private static void searchEl(int[] arr, int n) {
        for(int i=0; i<arr.length;i++){
            if(arr[i] == n){
                System.out.println("found at pos: "+i);
                return;
            }
        }
System.out.println("not found");
    }
    
}
