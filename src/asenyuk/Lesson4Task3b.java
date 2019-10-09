package asenyuk;

public class Lesson4Task3b {
    public static void main(String[] args) {

        String sd ="aaa ddd ffff gggg";

        int count = 0;


        if(sd.length() != 0){
            count++;

            for (int i = 0; i < sd.length(); i++) {
                if(sd.charAt(i) == ' '){

                    count++;
                }
            }
        }

        System.out.println("Вы ввели "+count+" слова");
    }

    }

