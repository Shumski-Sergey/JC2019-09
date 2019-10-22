package ilyaSakalouski.lesson_8;

class AnyType {
    static <M> Object getElement(M[] a, int num) {
        Catalog<M> lis = new Catalog<>();
        lis.setMass(a);
        return lis.getMass(num);
    }
}
