import java.util.LinkedList;
import java.util.List;

class leftRotation{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<Integer> arr = new LinkedList<Integer>(); 
        
        
        arr.add(1);        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
                    System.out.println(arr);
                    arr.remove(2);
                    System.out.println(arr);
arr.add(2,3);
System.out.println(arr);
/*
                    int d = 2;

                    for(int i=1;i<=d;i++){
                        int temp = arr.get(0);
                        //arr.remove(0);

                    // System.out.println(temp);
                        for(int j=1; j<arr.size();j++){
                            int shift = arr.get(j);
                            arr.remove(j-1);
                            arr.add(j-1,shift);
                        }
                       arr.add(arr.size()-1,temp);
                       arr.remove(arr.size()-1);
            System.out.println(arr); 
} */
}
}

