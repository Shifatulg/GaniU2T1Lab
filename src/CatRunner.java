public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Lovelle", 6, 15);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Harry", 12, 20);
        cat2.printCatInfo();
        cat2.introduce();


    }
}
