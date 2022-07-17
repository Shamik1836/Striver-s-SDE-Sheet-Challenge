public class Min_Heap{


    static int left(int k) {
        return 2 * k + 1;
    }


    static int right(int k) {
        return 2 * k + 2;
    }

    static int parent(int k) {
        return (k - 1) / 2;
    }

    static void heapify(int[] heap, int k, int size) {


        int l = left(k);

        int r = right(k);

        
        int smallest = k;

        if (l < size && heap[l] < heap[k]) {
            smallest = l;
        }

        if (r < size && heap[r] < heap[smallest]) {
            smallest = r;
        }

     
        if (smallest != k) {

          
            int tempp = heap[k];
            heap[k] = heap[smallest];
            heap[smallest] = tempp;

            heapify(heap, smallest, size);
        }
    }

    static int sz;

    static void insert(int[] heap, int val) {

      
        heap[sz] = val;

 
        int i = sz;

        sz += 1;

        while (i != 0 && heap[parent(i)] > heap[i]) {

            // Swap the value of current node with its parent.
            int tmp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = tmp;

  
            i = parent(i);
        }
    }

    static int extractMin(int[] heap) {

        if (sz == 1) {
            sz -= 1;
            return heap[0];
        }

        int val = heap[0];

        
        heap[0] = heap[sz - 1];

        sz -= 1;

       
        heapify(heap, 0, sz);

        return val;
    }

   
    static int[] minHeap(int n, int[][] q) {

        int size = 0;

        int[] heap = new int[n];

        int tot = 0;
        for(int i=0;i<n;i++){
            if(q[i][0]==1)tot++;
        }

        int[] ans = new int[tot];
        int id = 0;

        for (int i = 0; i < n; i++) {

            
            if (q[i][0] == 0) {
                sz = size;
                insert(heap, q[i][1]);
                size = sz;
            } else {
                sz = size;
                ans[id++] = extractMin(heap);
                size = sz;
            }
        }

       
        return ans;
    }
}