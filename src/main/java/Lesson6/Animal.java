package Lesson6;

public class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    public static int coun;

    public Animal(){
        coun++;
    }


    public void run(int dist){
        System.out.println(name == null ? "Животное не умеет бежать" : name + " не умеет бежать");
    }


    public void swim(int dist){
        System.out.println(name == null ? "Животное не умеет плыть" : name + " не умеет плыть");
    }

    public static void printCounts(){
        System.out.println("Количество создоных животных = " + coun);
    }

}

