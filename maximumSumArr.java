public class maximumSumArr {
    public static void main(String[] args) {
        int arr[] = {4,3,-2,6,-12,7,-1,6};
        int m = maxSumSubArr(arr);
        System.out.println(m);
    }

    private static int maxSumSubArr(int[] arr) {
        int maxSoFar = 0;
        int currentmax = 0;
        for(int i =0; i< arr.length;i++){
            currentmax = currentmax + arr[i];
            if(currentmax < arr[i]){
                currentmax = arr[i];
            }
            if(maxSoFar < currentmax){
                maxSoFar = currentmax;
            }
        }
        return maxSoFar;
    }
}
