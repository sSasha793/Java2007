package Lesson7;

public class Dog extends Animal{
    public static int coun;

    public Dog(String name) {
        this.name = name;
        maxRun = 500;
        maxSwim = 10;
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
        if (dist <= 0){
            super.run(dist);
        }else if (dist > maxRun){
            System.out.println(getName() + " не может пробежать больше " + maxRun + " м.");
        }else {
            System.out.println(getName() + " пробежал " + dist + " м.");
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= 0){
            super.run(dist);
        }else if (dist > maxRun){
            System.out.println(getName() + " не может проплыть больше " + maxSwim + " м.");
        }else {
            System.out.println(getName() + " проплыл " + dist + " м.");
        }
    }
    public static void printCounts(){
        System.out.println("Количество создоных собак = " + coun);
    }

}

