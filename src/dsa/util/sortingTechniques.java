package dsa.util;

public class sortingTechniques {
	
	void display(int[] arr) {
		System.out.println();
		for(int tempArr:arr) {
        	System.out.print(tempArr+" ");
        }
		System.out.println();
	}
	
	void bubbleSort(int arr[])
    {
//        Bubble Sort
        int n=arr.length;
        boolean swap;
        for (int i=0;i<n-1;i++) 
        {
            swap = false;
            for (int j=0;j<n-i-1;j++) 
            {
                if (arr[j]>arr[j+1]) 
                {
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap==false)
                break;
        }
        display(arr);
    }
	
	void merge(int Arr[], int start, int mid, int end) {

		
		int tempArr[]=new int[end - start + 1];
		int i = start, j=mid+1,k=0;
		while(i<=mid&&j<=end) {
			if(Arr[i]<=Arr[j]) {
				tempArr[k]=Arr[i];
				k +=1;i +=1;
			}
			else {
				tempArr[k] =Arr[j];
				k +=1; j +=1;
			}
		}
		while(i <= mid) {
			tempArr[k]=Arr[i];
			k +=1; i +=1;
		} 
		while(j <= end) {
			tempArr[k]=Arr[j];
			k +=1; j +=1;
		}
		for(i = start; i <= end; i += 1) {
			Arr[i]=tempArr[i-start];
		}
	}
	
	void mergeSort(int Arr[], int start, int end) {

		if(start < end) {
			int mid=(start + end)/2;
			mergeSort(Arr, start, mid);
			mergeSort(Arr, mid+1, end);
			merge(Arr, start, mid, end);
//			display(Arr);
		}
		
	}
	void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	  
	int partition(int[] arr, int low, int high)
	{
	    int pivot = arr[high]; 
	    int i = (low - 1); 
	  for(int j = low; j <= high - 1; j++)
	    {
	      if (arr[j] < pivot) 
	        {
	          i++; 
	          swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	
	void quickSort(int[] arr, int low, int high)
	{
	    if (low < high) 
	    {
	        int pi = partition(arr, low, high);
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
	
	public void heapSort(int arr[]){
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
	
	void heapify(int arr[], int n, int i){
        int largest = i; 
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
	void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
	
	void selectSort(int arr[]){
		
        int n = arr.length;
        for (int i=0;i<n-1;i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
            	if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp=arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
	
	

}
