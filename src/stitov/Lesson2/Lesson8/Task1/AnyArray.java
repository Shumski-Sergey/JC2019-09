package stitov.Lesson2.Lesson8.Task1;

/**
 * Created by user on 19.10.2019.
 */
public class AnyArray<T> {
  private T array[];
  public T getItem(int index){
    return this.array[index];
  }
  public AnyArray (T array[]){

    for (int i = 0; i< array.length; i++){
      this.array[i] = array[i];
    }
  }
}
