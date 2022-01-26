package Lesson7;

public class MainAPp {
    public static void main(String[] args) {

        Animal tom = new Cats("Tom");
        Animal murka = new Cats("Murka");
        Animal rex = new Dog("Rex");
        tom.run(150);
        tom.swim(20);
        rex.run(600);
        rex.swim(10);
        murka.run(300);
        murka.swim(20);

        Animal.printCounts();
        Dog.printCounts();
        Cats.printCounts();


    }



}

