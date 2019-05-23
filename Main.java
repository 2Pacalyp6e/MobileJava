public class Runner {

    public static void main(String[] args) {

        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Cat()
        };

        animals[1].setLimitRun(400);
        animals[2].setLimitRun(600);
        animals[2].setLimitJump(2);

        for (Animal animal : animals) {
            String cname = animal.getClass().getName();
            System.out.println(cname + ": run(450):  " + animal.run(450));
            System.out.println(cname + ": swim(3):   " + animal.swim(3));
            System.out.println(cname + ": jump(2):   " + animal.jump(2));
            System.out.println();
        }

    }

}