public class rearrangeMaxMinArr {
    static int[] a1 = new int[]{2,3,5,6,8,9};
    public static void main(String[] args) {
        arrangeMinMax();
        printArr(a1);
    }

    private static void arrangeMinMax() {
        int maxIdx = a1.length - 1;
        int minIdx = 0;
        int max = a1[maxIdx] + 1;
        for(int i=0; i<a1.length;i++){
            if(i % 2 ==0){
                a1[i] = a1[i] + (a1[maxIdx] % max) * max;
                maxIdx--;
            }
            else{
                a1[i] = a1[i] + (a1[minIdx] % max) * max;
                minIdx++;
            }
        }
        for(int i =0 ;i<a1.length;i++){
            a1[i] = a1[i] / max;
        }
        }
    private static void printArr(int[] a) {
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}
