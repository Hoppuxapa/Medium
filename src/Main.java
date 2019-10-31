import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        ArrayCreate arrayCreate = new ArrayCreate();
        Sorts sorts = new Sorts();

        Integer[] myArray = arrayCreate.fillArray();
        Integer[] myArray2 = arrayCreate.arrayCopy(myArray);
        Integer[] myArray3 = arrayCreate.arrayCopy(myArray);
        Integer[] myArray4 = arrayCreate.arrayCopy(myArray);
        Integer[] myArray6 = arrayCreate.arrayCopy(myArray);
        Integer[] myArray5 = arrayCreate.arrayCopy(myArray);


        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArray2));
        System.out.println(Arrays.toString(myArray3));
        System.out.println(Arrays.toString(myArray4));
        System.out.println(Arrays.toString(myArray5));
        System.out.println(Arrays.toString(myArray6));


        sorts.bSrtPoopsUp(myArray);
        sorts.bSrtDrowning(myArray2);
        sorts.insertionSort(myArray3);
        sorts.mergeSort(myArray4);
        sorts.qSrt(myArray5);
        sorts.arraysSort(myArray6);


        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArray2));
        System.out.println(Arrays.toString(myArray3));
        System.out.println(Arrays.toString(myArray4));
        System.out.println(Arrays.toString(myArray5));
        System.out.println(Arrays.toString(myArray6));

        System.out.println("\n"+"Время методов сортировки уже отсортированного массива {"+ "\n");
        sorts.bSrtPoopsUp(myArray);
        sorts.bSrtDrowning(myArray2);
        sorts.insertionSort(myArray3);
        sorts.mergeSort(myArray4);
        sorts.qSrt(myArray5);
        sorts.arraysSort(myArray6);
        System.out.println("\n"+"}");


        arrayCreate.arrayReverse(myArray);
        arrayCreate.arrayReverse(myArray2);
        arrayCreate.arrayReverse(myArray3);
        arrayCreate.arrayReverse(myArray4);
        arrayCreate.arrayReverse(myArray5);
        arrayCreate.arrayReverse(myArray6);


        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArray2));
        System.out.println(Arrays.toString(myArray3));
        System.out.println(Arrays.toString(myArray4));
        System.out.println(Arrays.toString(myArray5));
        System.out.println(Arrays.toString(myArray6));

        System.out.println("\n"+"Время методов сортировки массива, отсортированного в обратном порядке {"+ "\n");
        sorts.bSrtPoopsUp(myArray);
        sorts.bSrtDrowning(myArray2);
        sorts.insertionSort(myArray3);
        sorts.mergeSort(myArray4);
        sorts.qSrt(myArray5);
        sorts.arraysSort(myArray6);
        System.out.println("\n"+"}");


        arrayCreate.addRandomElem(myArray);
        arrayCreate.addRandomElem(myArray2);
        arrayCreate.addRandomElem(myArray3);
        arrayCreate.addRandomElem(myArray4);
        arrayCreate.addRandomElem(myArray5);
        arrayCreate.addRandomElem(myArray6);

        System.out.println("\n"+"Время сортировки отсортированного массива, в конец которого дописан случайный элемент {"+ "\n");
        sorts.bSrtPoopsUp(myArray);
        sorts.bSrtDrowning(myArray2);
        sorts.insertionSort(myArray3);
        sorts.mergeSort(myArray4);
        sorts.qSrt(myArray5);
        sorts.arraysSort(myArray6);
        System.out.println("\n"+"}");









    }
}
