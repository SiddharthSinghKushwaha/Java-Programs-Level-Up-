package divide_Conquer;

class MergeSorting 
{ 
    void merge(int arr[], int p, int q, int r) 
    { 
        int n1 = q - p + 1; 
        int n2 = r - q;
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = arr[p + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[q + 1+ j]; 
        int i = 0, j = 0; 
        int k = p;
        while (i < n1 && j < n2) 
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
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
    void sort(int arr[], int p, int r) 
    { 
        if (p < r) 
        { 
            int q = (p+r)/2; 
            sort(arr, p, q); 
            sort(arr , q+1, r); 
            merge(arr, p, q, r); 
        } 
    } 
    static void printArray(int arr[]) 
    { 
        //for each loop 
        for (int i: arr) 
            System.out.print(i + " "); 
        System.out.println(); 
    } 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7, 35}; 
        System.out.println("Given Array"); 
        printArray(arr); 
        MergeSorting ob = new MergeSorting(); 
        ob.sort(arr, 0, arr.length-1); 
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 