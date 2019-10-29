package balexej.test.Game;

public class SimpleDotComTestDrive {
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();// создаем экземпляр класса

        int[] locations = {2,3,4};//  создаем массив для местоположения корабля
        dot.setLocationCells(locations);  //  вызываем сетер  корабля


        String userGuess = "2";   // делаем ход
        String result = dot.checkYourSelf(userGuess);  // вызываем метод
        String testResult = "Неудачна";   //
        testResult = "Пройден";  //
        if (result.equals("Попал")){    //
            System.out.println(testResult);   // печатает результат прохождения теста
        }
    }
}
