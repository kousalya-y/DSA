public class max2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 9, 7, 11, 5, 20, 15 };
        int max1 = 0, max2 = 0;
        int diff = 0;

        for (int i = 0; i < 6; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }

            else if (arr[i] > max2) {
                max2 = arr[i];
            }
            diff = max1 - max2;
            System.out.println(diff);
        }
        diff = max1 - max2;
        System.out.println(max1 + " " + max2 + " " + diff);
    }

}

    // 9 7 11 5 20 15
    // }
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long arr[] = new long[n];
        /*
         * for(int j=0;j<n;j++){
         * arr[j]=0;
         * }
         */
        long max1 = 0, max2 = 0, diff = 0;
        long kp = 0;
        for (int i = 0; i < queries.size(); i++) {
            kp += queries.get(i).get(2);
        }
        for (int i = 0; i < queries.size(); i++) {
            int a = queries.get(i).get(0) - 1;
            int b = queries.get(i).get(1) - 1;
            long k = queries.get(i).get(2);

            for (int q = a; q <= b; q++) {
                arr[q] = arr[q] + k;
                if (arr[q] > max1) {
                    max2 = max1;
                    max1 = arr[q];
                }

                else if (arr[q] > max2) {
                    max2 = arr[q];
                }
                diff = max1 - max2;
            }
        }

        return max1;

    }
}