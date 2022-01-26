package Lesson6;

public class Cats extends Animal{

    public static int coun;

    public Cats(String name) {
        this.name = name;
        maxRun = 200;
        maxSwim = 0;
        coun++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run(int dist) {
        if (dist<= 0){
            super.run(dist);
        }else if (dist > maxRun){
            System.out.println(getName() + " не может пробежать больше " + maxRun + " м.");
        }else {
            System.out.println(getName() + " пробежал " + dist + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 0){
            super.run(distance);
        }else if (distance > maxRun){
            System.out.println(getName() + " не может проплыть больше " + maxSwim + " м.");
        }else {
            System.out.println(getName() + " проплыл " + distance + " м.");
        }
    }
    public static void printCounts(){
        System.out.println("Количество создоных котов = " + coun);
    }


}

