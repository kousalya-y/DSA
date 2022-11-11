import java.lang.annotation.Retention;

public class MaxPQ {
	private Integer[] heap;
	private int n; // size of max heap
	
	public MaxPQ(int capacity) {
		heap = new Integer[capacity + 1]; // index 0 is kept as empty
		n = 0;
	}
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size() {
		return n;
	}
	
	public void insert(int x) {
		if(n == heap.length - 1) {
			resize(2*heap.length);
		}
		n++;
		heap[n] = x;
		swim(n);
	}
	
	private void swim(int k) {
		while(k > 1 && heap[k/2] < heap[k]) {
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2; // bcoz we need to continue shifting up till 
                                 // new value inserted is at correct position
		}
	}

	private void resize(int capacity) {
		Integer[] temp = new Integer[capacity];
		for(int i = 0; i < heap.length; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
	}
	
	public void printMaxHeap() {
		for(int i = 1; i <= n; i++) {
			System.out.print(heap[i] + " ");
		}
	}

	public static void main(String[] args) {
		MaxPQ pq = new MaxPQ(3);
		pq.insert(4);
		pq.insert(5);
		pq.insert(2);
		pq.insert(6);
		pq.insert(1);
		pq.insert(3);
		System.out.println(pq.size());
		pq.printMaxHeap();
		int max = pq.deleteMax();
		System.out.println("max : "+max);
		pq.printMaxHeap();
	}

	private int deleteMax() {
		int max = heap[1];
		swap(1,n);
		n--;
		sink(1);
		heap[n+1] = null;
		if(n > 0 && (n==(heap.length - 1)/4)){
			resize(heap.length /2);
		}
	return max;

}

	private void sink(int i) {
		while(2*i <= n){
			int j = 2*i;
			if(j < n && heap[j] < heap[j+1]){
				j++;
			}
			if(heap[i] >= heap[j]){
				break;
			}
			swap(i, j);
			i=j;
		}
	}

	private void swap(int i, int n2) {
		int temp = heap[i];
		heap[i] = heap[n2];
		heap[n2] = heap[i];
	}
}