package balexej.test.Game;


public  class SimpleDotCom {
    int[] locationCells;   //хранение адреса ячеек
    int numOfHits = 0;    //хранение количества попаданий

   public void setLocationCells (int[] locs){
        locationCells = locs;
    }                                            // принимает целочисленный массив , хранит  адресс трех ячеек типа int

    public String checkYourSelf(String stringGuess){    //принимает ход пользователя в качестве string ,проверяет
      int guess = Integer.parseInt(stringGuess);  //преобразует полученные данные в int
      String result = "Мимо";   // переменная для хранения результата, по умолчанию мимо
      for (int cell : locationCells){  //  повторяем с каждой ячейкой массива
          if (guess == cell){   // сравниваем ход с элементом массива
              result = " Попал";  //
              numOfHits++;  //
              break;  //
          }
      }
if ( numOfHits == locationCells.length){   //если количество попаданий 3  то поопилт
    result = "Потопил";    //
}
System.out.println(result);    //
return result;   //
    }
}