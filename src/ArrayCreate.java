import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayCreate {
    public ArrayCreate() {

    }

    public Integer[] fillArray() {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arr.add(i);
        }
        Collections.shuffle(arr);
        Integer[] shuffledArray = arr.toArray(new Integer[0]);
        return shuffledArray;
    }

    public Integer[] arrayCopy(Integer[] arr) {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int elem : arr) {
            arrayList.add(elem);
        }
        Integer[] copiedArr = arrayList.toArray(new Integer[0]);
        return copiedArr;
    }

    public void arrayReverse(Integer[] arr) {
        int n = arr.length;
        int tmp;
        for (int i = 0; i < n / 2; i++) {
            tmp = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = tmp;
        }
    }
    public void addRandomElem(Integer[] arr){
        List<Integer> addedArr = new ArrayList<>();
        Random rnd = new Random();
        addedArr.add(rnd.nextInt(200)+100);
    }
}
