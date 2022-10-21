import java.util.LinkedList;
import java.util.Queue;
public class queuePro {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        String[] arr = new String[4];
        q1.add(1);
        for(int i=0; i<4; i++){
            arr[i] = Integer.toString(q1.remove());
            String n1 = arr[i]+"0";
            String n2 = arr[i]+"1";   
            q1.add(Integer.parseInt(n1));
            q1.add(Integer.parseInt(n2));
        }
        for(int i=0; i< arr.length;i++)
        System.out.println(arr[i]);
    }
}
