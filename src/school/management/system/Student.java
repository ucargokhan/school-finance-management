package school.management.system;

// This class is responsible for keeping the track of student fees, name, grade and fees paid

public class Student
{
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /*
     To create a new student object by initializing parameters and values.
     id for student: unique
     name for student
     grade for student
     fees for every student is 30,000 dollars
     fees paid initially is 0.
     */
    public Student(int id, String name, int grade)
    {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    //Not going to alter student's name and id.//

    //Used to update a student's grade, like promoting to a higher grade.
    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    // keep adding the fees to feesPaid
    // adding the fees to fees paid.
    // int fees is the fees that student pays.
    // school is going to receive the funds.
    public void payFees(int fees)
    {
        feesPaid += fees; //continously adding the fees.
        School.updateTotalMoneyEarned(feesPaid);
    }


    //returns id of the student
    public int getId() {
        return id;
    }

    //returns name of the student
    public String getName() {
        return name;
    }

    //returns grade of the student
    public int getGrade() {
        return grade;
    }

    //returns paid fees of the student
    public int getFeesPaid() {
        return feesPaid;
    }

    //returns total fees of the student
    public int getFeesTotal() {
        return feesTotal;
    }

    //return the remaining fees
    public int getRemainingFees()
    {
        return feesTotal-feesPaid;
    }

    @Override
    public String toString()
    {
        return "Öğrencinin adı: " + name +
                " ---- şimdiye kadar ödenen ücret: " + feesPaid;

    }

}
