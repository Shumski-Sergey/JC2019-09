package balexej.No.Game;

public class Game {


    public static void main(String []args){
        int numOfGuesses = 0;//переменная ходов пользователя
        GameHelper helper = new GameHelper();
        SimpleDotCom theDocCom = new SimpleDotCom();
        int randomNum = (int) (Math.random()*5);//генерируем случайное число для первой ячейки и используем для форм. массива
        int[] location = {randomNum, randomNum+1, randomNum+2};
          theDocCom.setLocationCells(location);// передает сайту местонахождение масива
          boolean isAlive = true;// значение чтобы проверить в цикле не закончилась ли игра
          while (isAlive==true){

              String guess = helper.getUserInput ("Введите число");   //получаем строку вводимую пользователем
              String result = theDocCom.checkYourSelf(guess);
              numOfGuesses++;
              if (result.equals("Потопил")){
                  isAlive = false;
System.out.println( "Вам потребовалось"+ numOfGuesses + "попыток" );
              }
          }
    }
}
