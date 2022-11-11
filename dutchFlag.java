public class dutchFlag {
    static int[] a =  new int[]{2,0,2,2,0,1,1};

    public static void main(String[] args) {
        threesort();
        printArr();
    }
    private static void threesort() {
        int i =0;
        int j = 0;
        int k = a.length - 1;
        while(i <= k){
            if(a[i] == 0){
                swap(i,j);
                i++;
                j++;
            }
            else if(a[i] == 1){
                i++;
            }
            else if(a[i] == 2){
                swap(i,k);
                k--;
            }
        }
    }

    private static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void printArr() {
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
