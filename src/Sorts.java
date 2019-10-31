import java.util.Arrays;

public class Sorts {

    public void bSrtPoopsUp(Integer[] arr) {
        long startTime = System.nanoTime();
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        long stopTime = System.nanoTime();

        System.out.println("Время пузырьковой сортировки(элемент «всплывает») = " + (stopTime - startTime));
    }

    public void bSrtDrowning(Integer[] arr) {
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        long stopTime = System.nanoTime();

        System.out.println("Время пузырьковой сортировки  (элемент «тонет») = " + (stopTime - startTime));
    }

    public void insertionSort(Integer[] arr) {
        long startTime = System.nanoTime();
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
        long stopTime = System.nanoTime();

        System.out.println("Время обменной сортировки = " + (stopTime - startTime));
    }

    public void mergeSort(Integer[] arr) {
        long startTime = System.nanoTime();
        int lo = 0;
        int hi = arr.length - 1;
        doMergeSort(arr, lo, hi);
        long stopTime = System.nanoTime();
        System.out.println("Время сортировки со слиянием = " + (stopTime - startTime));
    }

    private void doMergeSort(Integer[] arr, int lo, int hi) {


        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        doMergeSort(arr, lo, mid);
        doMergeSort(arr, mid + 1, hi);

        Integer[] buf = Arrays.copyOf(arr, arr.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = arr[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                arr[k] = buf[j];
                j++;
            } else if (j > hi) {
                arr[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                arr[k] = buf[j];
                j++;
            } else {
                arr[k] = buf[i];
                i++;
            }
        }
    }




    public void qSrt(Integer[] arr) {
        long startTime = System.nanoTime();
        int start = 0;
        int end = arr.length - 1;
        doQuickSort(arr,start, end);

        long stopTime = System.nanoTime();

        System.out.println("Время рекурсивной сортировки с использованием методом половинного деления = " + (stopTime - startTime));

    }

    private void doQuickSort(Integer [] arr, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (arr[i] <= arr[cur])) {
                i++;
            }
            while (j > cur && (arr[cur] <= arr[j])) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doQuickSort(arr, start, cur);
        doQuickSort(arr,cur+1, end);

    }

    public void arraysSort(Integer[] arr) {

        long startTime = System.nanoTime();

        Arrays.sort(arr);

        long stopTime = System.nanoTime();

        System.out.println("Время сортировки с помощью Arrays.sort = " + (stopTime - startTime));

    }


}
