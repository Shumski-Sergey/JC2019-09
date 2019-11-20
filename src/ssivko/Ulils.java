package ssivko;

import java.util.*;

public class Ulils {
    private static final int MIN_POSITIVE_RATING = 40;
    private static final int RANDOM_ELEMENT = 10000;
    private static final int ELEMENT = 1000000;
    private static final int MAX_RATING = 100;
    private static final int DIAPAZON = 40;

    public static Integer[] scanMassiv() {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Integer [] mass = new Integer[size];
        for (int i = 0; i < mass.length; i++ ) {
            mass[i] = (int) (Math.random()* DIAPAZON);
        }
        return mass;
    }

    public static void deleteElement(ArrayList<Integer> rating) {
        deleteElementControl(rating, MIN_POSITIVE_RATING);
    }

    public static void deleteElementControl(ArrayList<Integer> rating, int minPositiveRating) {
        for (int i = 0; i < rating.size(); i++){
            if (rating.get(i) < minPositiveRating){
                rating.remove(i);
                i--;
            }
        }
    }

    public static void printRating(ArrayList<Integer> rating) {
        for (int i = 0; i < rating.size(); i++) {
            System.out.print(rating.get(i)+ " ");
        }
    }

    public static void RandomMethod(ArrayList<Integer> rating, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++){
            rating.add(random.nextInt(MAX_RATING));
        }
    }

    public static int entryNumber() {
        Scanner number = new Scanner(System.in);
        int h1 = number.nextInt();
        return h1;
    }

    public static String[] scannerText() {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.toLowerCase();
        return text.split(" ");
    }

    public static void deleteElement2(ArrayList<Integer> rating) {
        for (int i = 0; i < rating.size(); i++){
            for (int j = rating.size()-1; j > i; j-- ){
                if (rating.get(i).equals(rating.get(j))){
                    rating.remove(j);
                    j++;
                }
            }
        }
    }
    public static Integer iteratorMethod(ArrayList<Integer> rating) {
        Iterator<Integer> iterator = rating.iterator();
        Integer max = 0;
        while (iterator.hasNext()){
            Integer numIter = iterator.next();
            if (numIter > max){
                max = numIter;
            }
        }
        return max;
    }

    public static List<Integer> listRandom(List<Integer> list, int size ) {
        for (int i = 0; i < size; i++) {
            Random randomBig = new Random();
            int random = randomBig.nextInt();
            list.add(random);
        }
        return list;
    }

    public static void randomSelection(List<Integer> selectionList ){
        for ( int i = 0; i < RANDOM_ELEMENT; i++){
            int ran = (int) (Math.random() * ELEMENT);
            selectionList.get(ran);
        }

    }

    public static void conversion(String[] set, Map<String, String> map) {
        for(int i = 0; i < set.length; i++) {
            String elements = set[i];
            char [] word = set[i].toCharArray();
            Arrays.sort(word);
            String resolution  = new String(word);
            String value = map.get(resolution);
            conversionPlus(map, elements, resolution, value);
        }
    }

    private static void conversionPlus(Map<String, String> map, String elements, String resolution, String value) {
        if(value == null){
            map.put(resolution, elements );
        }else{
            map.put(resolution, value + " " + elements);
        }
    }

    public static void printMap(Map<String, String> map) {
        for(String wordSingle : map.values()){
            System.out.println(wordSingle);
        }
    }

    public static String [] callString(){
        System.out.println("Вводите здесь: ");
        Scanner text = new Scanner(System.in);
        return text.nextLine().split(" ");
    }

}
