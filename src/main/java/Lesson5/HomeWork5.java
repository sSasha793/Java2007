package Lesson5;

import java.util.Arrays;

public class HomeWork5 {

    public static void main(String[] args) {
        Сотрудник Ivan = new Сотрудник(" Ivanov Ivanovich Ivan ", "Advocate", 46, "ivivan@mailbox.com", 043533643, 40000);
        System.out.println("1)"+"name = " + Ivan.Full_name + " ; profession  = " + Ivan.profession + "; Email = " + Ivan.Email + "; Salary = " + Ivan.Salary + " ; year = " + Ivan.age);
        System.out.println(  );

        //Сотрудник [] Person = new Сотрудник[] { Kolya , Vova ,Mihail , Ivan , Anton};


        Сотрудник[] Person = new Сотрудник[5];
        Person[0] = new Сотрудник(" Mihail Kasyan   ", " Бухгалтер  ", 25, "mih54353vv@gmail.com", 036333654, 50000);

        Person[1] = new Сотрудник(" Anton Antonov ", " Учитель ", 43, "ant212@gmail.com", 043245525, 20000);

        Person[2] = new Сотрудник(" Ivanov Ivanovich Ivan ", "Advocate", 46, "ivivan@mailbox.com", 043533643, 40000);

        Person[3] = new Сотрудник(" Kostya  ", " Бухгалтер  ", 23, "fggag342@gmail.com", 055311244, 50000);

        Person[4] = new Сотрудник(" Vova Velichko  ", " сторитель ", 50, "aggh53vv@gmail.com", 065565, 50000);
        for (int i = 0; i < Person.length; i++) {
            if (Person[i].age > 40) {
                //System.out.println(Person[i]);
                Person[i].getInfo();
            }

        }
    }

}