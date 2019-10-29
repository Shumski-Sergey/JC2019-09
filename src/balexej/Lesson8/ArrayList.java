package balexej.Lesson8;

//1. Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.


import java.util.List;

public class ArrayList<I extends Number> {
    public  static  void main (String[] args){
        ArrayList<Integer> gray =  new ArrayList<Integer>();

        int rand =(int) Math.random()*100;
        System.out.println(rand);

    }

}
