//import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] a = new int[10];
       // Scanner sc = new Scanner(System.in);
       // a[0] =  sc.nextInt();
       // System.out.println(a[0]);
       a[0] = 0;
        a[1]=2;
        a[2]=0;
        a[3]=4;
        a[4]=3;
        a[5]=0;
        a[6]=10;
        a[7]=20;
        a[8]=23;
        a[9]=24;
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
        System.out.println();
        for(int i=0; i<a.length/2; i++){
            int temp = a[i];
                  a[i] = a[a.length-1-i];
                  a[a.length-1-i] = temp;
        }
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        removeZeroes(a);
    }

    private static void removeZeroes(int[] arr) {
              for(int i =0 ; i<arr.length; i++){
                int j;
                if(arr[i] == 0){
                    for(j = i;j < arr.length;j++){
                       if(arr[j]!=0)
                       break;
                    }
                    arr[i] = arr[j];
                    arr[j] = 0;
                }
              }    
              for(int i=0; i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
              
    }
}
