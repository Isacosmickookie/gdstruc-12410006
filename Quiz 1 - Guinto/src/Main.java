public class Main {

    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -50;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;

        System.out.println("Before selection sort:");
        printArrayElements(numbers);

        selectionSort(numbers);
        System.out.println("After selection Sort");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] arr)
    {
         for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
         {
             for (int i = 0; i < lastSortedIndex; i++)
             {
                 if (arr[i] < arr[i + 1]) //just have to change > to <
                 {
                     int temp = arr[i];
                     arr[i] = arr[i + 1];
                     arr[i + 1] = temp;
                 }
             }
         }
    }
    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;
            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }
    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.println(j);
        }
    }

}
