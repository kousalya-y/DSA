import java.util.Stack;
public class Stack1{
public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    int[] arr = new int[6];
    arr[0]=4;
    arr[1]=7;
    arr[2]=3;
    arr[3]=4;
    arr[4]=8;
    arr[5]=1;  
    for(int i : arr){
        System.out.print(i+" ");
    }
    System.out.println();
   int[] res = new int[arr.length];
   for(int i= arr.length-1; i>=0;i--){
    if(!s.isEmpty()){
           while(!s.isEmpty() && s.peek() <= arr[i]){
            s.pop();
           }
    }
    if(s.isEmpty()){
        res[i]=-1;
    }
    else{
        res[i]=s.peek();
    }
    s.push(arr[i]);
   }
   for(int j : res){
    System.out.print(j+" ");
}
}
}