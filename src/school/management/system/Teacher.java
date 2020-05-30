package school.management.system;

//this class is responsible for keeping the track of teacher's id, name and salary.

public class Teacher
{
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /*
     To create a new teacher object by initializing parameters
     id for teacher: unique
     name for teacher
     salary for teacher: unique
     */
    public Teacher(int id, String name, int salary)
    {
       this.id = id;
       this.name = name;
       this.salary = salary;
       this.salaryEarned = 0;
    }

    //returns the id of teacher
    public int getId()
    {
        return id;
    }

    //returns the name of teacher
    public String getName()
    {
        return name;
    }

    //returns the salary of teacher
    public int getSalary()
    {
        return salary;
    }

    //sets / updates the salary of teacher
    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    //adds to the salaryEarned
    //removes from the total money earned by school
    public void receiveSalary(int salary)
    {
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Öğretmenin adı " + name
                +" ---- şimdiye kadar aldığı maaş: " + salaryEarned;
    }
}
