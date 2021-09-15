


public class exercise1

{
    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) 
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
  
            // IF no two elements were 
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }
  

    // Function to print an array 
    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {

        int test = 0;
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        int test1 []= {5,4,3,2,1};
        int j = test1.length;

        bubbleSort(arr, n);
        System.out.println("Sorted array1: ");
        printArray(arr, n);


        bubbleSort(test1, j);
        System.out.println("Sorted array2: ");
        printArray(test1, j);

    }
}

//Code from https://www.geeksforgeeks.org/bubble-sort/
