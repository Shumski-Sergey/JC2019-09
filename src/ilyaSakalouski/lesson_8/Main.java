package ilyaSakalouski.lesson_8;

class Main {
    public static void main(String[] args) {
        Integer[] mass1 = new Integer[]{1,2,3,4};
        Double[] mass2 = new Double[]{5.,6.,7.,8.};
        String[] mass3 = new String[]{"AA","BB","CC","DD"};
        System.out.println(AnyType.getElement(mass1,3). toString());
        System.out.println(AnyType.getElement(mass2,1). toString());
        System.out.println(AnyType.getElement(mass3,0). toString());
    }
}
