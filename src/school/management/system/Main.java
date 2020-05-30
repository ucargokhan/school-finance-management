package school.management.system;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Teacher fatma = new Teacher(1,"Fatma",500);
        Teacher ayse = new Teacher(2,"Ayşe",700);
        Teacher ahmet = new Teacher(3,"Ahmet",600);

        ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(fatma);
        teacherList.add(ayse);
        teacherList.add(ahmet);

        Student hayriye = new Student(1,"Hayriye",4);
        Student gokhan = new Student(2,"Gökhan",12);
        Student veli = new Student(3,"Veli",5);

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(hayriye);
        studentList.add(gokhan);
        studentList.add(veli);

        School okul1 = new School(teacherList, studentList);

        hayriye.payFees(5000);
        gokhan.payFees(6000);
        System.out.println("Okul1'in kazandığı toplam para: "+okul1.getTotalMoneyEarned()+" Dolar");

        System.out.println("------Okul1 maaş ödemesi yapıyor-------");
        ayse.receiveSalary(ayse.getSalary());

        System.out.println("Okul1 " + fatma.getName() + " isimli öğretmene "
        + fatma.getSalary() + " Dolar maaş ödemesi yaptı.");

        System.out.println("Okul1 " + ahmet.getName() + " isimli öğretmene "
        + ahmet.getSalary() + " Dolar maaş ödemesi yaptı.");

        System.out.println("Okul1'in elindeki toplam para: " + okul1.getTotalMoneyEarned() + " Dolar.");

        System.out.println(gokhan);
        System.out.println(ayse);



    }
}
