package Lesson5;

public class Сотрудник {
   //Сотрудник Ivan = new Сотрудник(" Ivanov Ivanovich Ivan " ,"Advocate" , 46 , "ivivan@mailbox.com" , 043533643 , 40000 );
    public String Full_name = " Ivanov Ivanovich Ivan ";
    public String profession = "Advocate";
    public int age = 46;
    public String Email = "Advocate";
    public int Number =  043533643;
    public int Salary = 40000;


    public  Сотрудник (String Full_name , String profession , int age , String Email , int Number ,  int Salary ) {
        this.Full_name = Full_name;
        this.profession = profession;
        this.age = age;
        this.Email = Email;
        this.Number = Number;
        this.Salary = Salary;
    }
    public void getInfo() {
        System.out.println("ФИО: " + Full_name + ", должность: " + profession + ", email: " + Email+ ", телефон: " + Number + ", зарплата: " + Salary + ", возраст: "+ age);
    }

}