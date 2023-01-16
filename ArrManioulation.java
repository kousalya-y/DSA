public public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here
    long arr[] = new long[n];
    for(int j=0;j<n;j++){
        arr[j]=0;
    }
    
    for(int i=0; i<queries.size();i++){
        int a = queries.get(i).get(0)-1;
        int b = queries.get(i).get(1)-1;
        int k = queries.get(i).get(2);
        for(int q = a;q<=b;q++){
            arr[q] = arr[q]+k;
        }        
    }
    long max =arr[0];
    for(int i=1; i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
    }