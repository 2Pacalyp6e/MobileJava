public class Main {
    public static void main(String[] args) {
        System.out.println("Братья коты");
        Cat[] x = {new Cat("Snezhok", 5), new Cat("Barsik", 8), new Cat("Murka", 17)};
        Plate plate = new Plate(100);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Заполнить миску на 100");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Кошки съели еду:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}