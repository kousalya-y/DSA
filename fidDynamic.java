public class fidDynamic {
        public static void main(String[] args) {
            int res = fib1(6);
            System.out.println(res);
        }
    
        private static int fib1(int n) {
            int[] table = new int[n+1];
            table[0] = 0;
            table[1] = 1;
            for(int i=2;i<=n;i++){
                table[i] = table[i-1]+table[i-2];
            }
            return table[n];
        }
}
