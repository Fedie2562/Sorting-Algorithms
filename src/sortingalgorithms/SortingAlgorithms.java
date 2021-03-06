/*
 * 
 */

package sortingalgorithms;

import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class SortingAlgorithms {

    
    public static int loopCounter, comparisonCounter, shiftCounter, input;
    int swapsNum = 0;
    int compsNum = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        loopCounter = 0;
        comparisonCounter = 0;
        shiftCounter = 0;
        int arraySize;
        String myInput = JOptionPane.showInputDialog("How many random numbers do you wish to generate?");
        arraySize = Integer.parseInt(myInput);

        int nums[] = new int[arraySize];
        int nums2[] = new int[arraySize];
        int nums3[] = new int[arraySize];
        int nums4[] = new int[arraySize];
        int nums5[] = new int[arraySize];
        int nums6[] = new int[arraySize];
        int nums7[] = new int[arraySize];

        int n;
        for (int i = 0; i < arraySize; i++) {
            n = (int) (Math.random() * 1000);
            nums[i] = n;
            nums2[i] = n;
            nums3[i] = n;
            nums4[i] = n;
            nums5[i] = n;
            nums6[i] = n;
            nums7[i] = n;
        }
        
        //Display the unsorted list
        System.out.println("The unsorted list is:");
        for (int i = 0; i < arraySize; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("\n------------------------------------");

        long time = -1; //timer variable

        //Selection Sort
        System.out.println("Perfoming Selection Sort");
        time = System.currentTimeMillis();
        selectionSort(nums);
        time = System.currentTimeMillis() - time;

        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        System.out.println("shiftCounter = " + shiftCounter);
        System.out.println("\n------------------------------------");

        loopCounter = 0;
        comparisonCounter = 0;
        shiftCounter = 0;

        //Bubble Sort
        System.out.println("Performing Bubble Sort");
        time = System.currentTimeMillis();
        bubbleSort(nums2);
        time = System.currentTimeMillis() - time;

        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        System.out.println("shiftCounter = " + shiftCounter);
        System.out.println("\n------------------------------------");

        loopCounter = 0;
        comparisonCounter = 0;
        shiftCounter = 0;

        //Insertion Sort
        System.out.println("Performing Insertion Sort");
        time = System.currentTimeMillis();
        insertionSort(nums3);
        time = System.currentTimeMillis() - time;

        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        System.out.println("shiftCounter = " + shiftCounter);
        System.out.println("\n------------------------------------");

        loopCounter = 0;
        comparisonCounter = 0;
        shiftCounter = 0;

        //Quick Sort
        System.out.println("Performing Quick Sort");
        time = System.currentTimeMillis();
        quickSort(nums4, 0, nums4.length - 1);
        time = System.currentTimeMillis() - time;


        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        System.out.println("shiftCounter = " + shiftCounter);
        System.out.println("\n------------------------------------");
        
        loopCounter = 0;
        comparisonCounter = 0;
        shiftCounter = 0;
        
        //Radix Sort
        int input = arraySize;
        System.out.println("Performing Radix Sort");
        time = System.currentTimeMillis();
        radixSort(nums5);
        time = System.currentTimeMillis() - time;
        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        System.out.println("shiftCounter = " + shiftCounter);
        System.out.println("\n------------------------------------");
        
        loopCounter = 0;
        comparisonCounter = 0;
        shiftCounter = 0;
        
        //Heap Sort
        System.out.println("Performing Heap Sort");
        SortingAlgorithms ob = new SortingAlgorithms();
        time = System.currentTimeMillis(); 
        ob.heapSort(nums6);
        time = System.currentTimeMillis() - time;
        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        System.out.println("shiftCounter = " + shiftCounter);
        System.out.println("\n------------------------------------");
        
        loopCounter = 0;
        comparisonCounter = 0;
        shiftCounter = 0;
        
        //Merge Sort
        System.out.println("Performing Merge Sort");
        time = System.currentTimeMillis(); 
	ob.sort(nums7, 0, nums7.length-1); 
        time = System.currentTimeMillis() - time;
        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        System.out.println("shiftCounter = " + shiftCounter);
        System.out.println("\n------------------------------------");
    }
    
    public static void sort(int arr[], int l, int r) 
    { 
            if (l < r) 
            { 
		// Find the middle point 
		int m = (l+r)/2; 

		// Sort first and second halves 
		sort(arr, l, m); 
		sort(arr , m+1, r); 

		// Merge the sorted halves 
		merge(arr, l, m, r); 
	} 
    } 
    public static void merge(int arr[], int l, int m, int r) 
	{ 
		// Find sizes of two subarrays to be merged 
		int array1 = m - l + 1; 
		int array2 = r - m; 

		/* Create temp arrays */
		int L[] = new int [array1]; 
		int R[] = new int [array2]; 

		/*Copy data to temp arrays*/
		for (int i=0; i<array1; ++i) 
			L[i] = arr[l + i]; 
		for (int j=0; j<array2; ++j) 
			R[j] = arr[m + 1+ j]; 


		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays 
		int i = 0, j = 0; 

		// Initial index of merged subarry array 
		int k = l; 
		while (i < array1 && j < array2) 
		{ 
			if (L[i] <= R[j]) 
			{ 
				arr[k] = L[i]; 
				i++; 
			} 
			else
			{ 
				arr[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 

		/* Copy remaining elements of L[] if any */
		while (i < array1) 
		{ 
                    arr[k] = L[i]; 
                    i++; 
                    k++; 
		} 

		/* Copy remaining elements of R[] if any */
		while (j < array2) 
		{ 
                    arr[k] = R[j]; 
                    j++; 
                    k++; 
	} 
    } 
    public void heapSort(int arr[]) {
        
        //pass n as the length of the array
        int n = arr.length; 
  
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
                heapify(arr, n, i); 
  
        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
             
            
            // call max heapify on the reduced heap 
            heapify(arr, i, 0); 
        } 
        
    }
    void heapify(int arr[], int n, int i) {
            
        comparisonCounter++;
         
        //actually the index 
        int largest = i;  // Initialize largest as root (parent) 
        int l = 2*i + 1;  // left = 2*i + 1 
        int r = 2*i + 2;  // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) { 
            largest = l; 
        }
  
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]){ 
            largest = r; 
        }
  
        // If largest is not root 
        if (largest != i) 
        { 
            //swaps
            shiftCounter++;
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap;
             
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest); 
        } 
    } 
    public static void radixSort(int[] array)
    {
        int largestValue = getLargestValue(array);
        
        for (int exponent = 1; largestValue / exponent > 0; exponent *= 10)
        {
            int[] sortedArray = new int[input], numberCount = new int[10];
            
            //Gets number of digits with the same value (number of 0's, 1's, ...)
            for (int i = 0; i < input; i++)
                numberCount[9 - getDigit(array[i], exponent)]++;
            
            //Get's real position of numbers in sortedArray 
            for (int i = 1; i < 10; i++)
                numberCount[i] += numberCount[i - 1];
            
            //Writes to sortedArray (in reverse order because position in numberOfNumbers is the furthest position of that digit
            for(int i = input - 1; i >= 0; i--)
            {
                sortedArray[9 - numberCount[getDigit(array[i], exponent)] - 1] = array[i];
                numberCount[getDigit(array[i], exponent)]--;
            }
            
            //Updates array with sorted digits
            for (int i = 0; i < input; i++)
                array[i] = sortedArray[i];
        }
    }
    public static int getDigit(int number, int digitNumber)
    {
        return (int) (number / digitNumber) % 10;
    }
    public static int getLargestValue(int[] array)
    {
        int largestValue = 0;
        for (int element : array)
        {
            largestValue = element > largestValue ? element : largestValue;
        }
        return largestValue;
    }
    public static void bubbleSort(int data[]) {
        int counter;
        //Loop to control number of passes
        for (int pass = 1; pass < data.length; pass++) {
            loopCounter++;
            //Loop to control number of comparisons for length of array - 1
            for (int element = 0; element < data.length - 1; element++) {
                loopCounter++;
                //compare side-by-side elements and swap them if
                //first element is greater than second element
                comparisonCounter++;
                if (data[element] > data[element + 1]) {
                    shiftCounter++;
                    swap(data, element, element + 1);  //call to swap method
                }
            }
        }
    }

    public static void swap(int array2[], int first, int second) {
        int hold = array2[first];
        array2[first] = array2[second];
        array2[second] = hold;
    }

    public static void insertionSort(int data[]) {
        int insert;

        for (int next = 1; next < data.length; next++) {
            loopCounter++;
            insert = data[next];
            int moveItem = next;

            while (moveItem > 0 && data[moveItem - 1] > insert) {
                loopCounter++;
                shiftCounter++;
                data[moveItem] = data[moveItem - 1];
                moveItem--;
            }
            data[moveItem] = insert;
        }
    }

    public static void quickSort(int data[], int low, int high) {
        loopCounter++;
        int partitionLoc;
        comparisonCounter++;
        if (low < high) {
            partitionLoc = partition(data, low, high);
            quickSort(data, low, partitionLoc - 1);
            quickSort(data, partitionLoc + 1, high);
        }
    }

    public static int partition(int data2[], int left, int right) {
        boolean moveLeft = true;
        int separator = data2[left];

        while (left < right) {
            loopCounter++;
            comparisonCounter++;
            if (moveLeft == true) {
                while ((data2[right] >= separator) && (left < right)) {
                    loopCounter++;
                    right--;
                }
                shiftCounter++;
                data2[left] = data2[right];
                moveLeft = false;
            } else {
                while ((data2[left] <= separator) && (left < right)) {
                    loopCounter++;
                    left++;
                }
                shiftCounter++;
                data2[right] = data2[left];
                moveLeft = true;
            }
        }
        shiftCounter++;
        data2[left] = separator;
        return left;
    }

    public static void selectionSort(int data[]) {
        int smallest;
        for (int i = 0; i < data.length - 1; i++) {
            loopCounter++;
            smallest = i;
            //see if there is a smaller number further in the array
            for (int index = i + 1; index < data.length; index++) {
                loopCounter++;
                comparisonCounter++;
                if (data[index] < data[smallest]) {
                    smallest = index;
                }
            }
            shiftCounter++;
            swap(data, i, smallest); //swap the smallest element into position
        }
    }
}
