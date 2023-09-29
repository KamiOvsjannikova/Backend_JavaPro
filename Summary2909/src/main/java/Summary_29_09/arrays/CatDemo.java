package Summary_29_09.arrays;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", "brit", 3);
        Cat cat2 = new Cat("Barsik", "sibirskay", 2);
        Cat cat3 = new Cat("Dexter", "siam", 4);

        System.out.println(cat1.getBreed());
        System.out.println(cat2.getBreed());
        System.out.println(cat3.getBreed());

        Cat[] cats = {cat1, cat2, cat3};

        //System.out.println(Arrays.toString(cats));

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getBreed());
        }
    }
}
