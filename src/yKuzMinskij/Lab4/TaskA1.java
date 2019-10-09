package yKuzMinskij.Lab4;
    /**
     * В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
     */
public class TaskA1 {
    public static void main (String[] args) {
      positionOfMaxMarks();
      }
      public static int[] creatingMarksArray () {
          int [] marksArray = new int[100];
          for (int i=0; i!=marksArray.length; i++) {
              marksArray[i] = (int) (Math.random() * 10);
          }
          return marksArray;
      }
      public static int maxMark (int [] marksArray){
        int maxMark=0;
        for (int i=0; i<marksArray.length; i++ ){
            if (marksArray[i]>maxMark){
                maxMark = marksArray [i];
            }
        }
        return maxMark;
    }
      public static void positionOfMaxMarks (){
        int [] marksArray = creatingMarksArray();
        int maxMark = maxMark(marksArray);
        for (int i=0; i<marksArray.length; i++){
            if (marksArray[i]==maxMark){
                System.out.println("Максимальная оценка " + maxMark+ " находится на позиции " + i);
            }
        }

      }
}