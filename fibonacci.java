public class fibonacci {
    public static void main(String[] args) {
        int res = fib(6);
        System.out.println(res);
    }

    private static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int left = fib(n-1);
        int right = fib(n-2);
        return left + right;
    }
    
}

//0 1 1 2 3 5 8