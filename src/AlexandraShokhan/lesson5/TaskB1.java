package AlexandraShokhan.lesson5;

//1.Напишите два цикла выполняющих многократное сложение строк, один
//с помощью оператора сложения и String, а другой с помощью StringBuilder
//и метода append. Сравните скорость их выполнения.

public class TaskB1 {
    public static void main(String[] args) {
        String [] words;
        words = new String[]{"received", "overcame", "oh", "sensible", "so", "at", "an", "formed", "do", "change", "jhbjhbjbjhbjubjbjbj", "jhbjbububibibcbiwebiybeuwbiwebiy", "hbubiuibibiybuybuyibubugbuigbuybuydxbwuevbdukwe", "hbchbwbeuveicbibcubcuwbeuybiudbiqhbiqbcibqicbbdewb", "bububbuybiyb", "iuhiuhibiihibuvghv", "iuuuyuuguyuyvhgvcgftcxdxtrdcyr", "hbuhbuyuvuguvgvgvuydgvuywgdiyg3uycg", "ÿuybuubuvuvuvygvuyguygubuybujbuj"};
        String text1;
        text1 = new String();
        StringBuilder text2;
        text2 = new StringBuilder();

        long start1 = System.currentTimeMillis();
        for(int i = 0; i<= words.length - 1; i++) {
            text1 = text1 + words[i];
        }
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        for(int i = 0; i<= words.length - 1; i++) {
            text2.append(words[i]);
        }
        long end2 = System.currentTimeMillis();

        if(end1 - start1 < end2 - start2) {
            System.out.println("Многократное сложение строк с помощью оператора сложения быстрее.");
        } else if (end1 - start1 == end2 - start2) {
            System.out.println("Многократное сложение строк с помощью оператора сложения и сложение с помощью StringBuilder заняло одинаковое количество времени.");
        } else if (end1 - start1 > end2 - start2) {
            System.out.println("Многократное сложение строк с помощью StringBuilder быстрее.");
        }
        System.out.println(start1);
        System.out.println(end1);
        System.out.println(start2);
        System.out.println(end2);
    }
}
