package asenyuk.Lesson7.Task1;

import asenyuk.Lesson7.Task1.ArrayT;

public class MainT {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[] {1, 2, 3};
       String[] arr2 = new String[] {"one", "two", "three"};

       ArrayT<Integer> array1 = new ArrayT <> ();

      array1.setArr(arr1);

      ArrayT <String>  array2= new ArrayT<>();

      array2.setArr(arr2);

      array1.showArray(1);
      array2.showArray(2);


    }
}
