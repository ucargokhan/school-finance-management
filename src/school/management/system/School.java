package school.management.system;

//implements teachers and students by using ArrayList

import java.util.ArrayList;

public class School
{
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private static int totalMoneyEarned;
    private int totalMoneySpent;


    //new school object is created
    //lists of teachers and students are using
    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers=teachers;
        this.students=students;
        updateTotalMoneyEarned(0);
        updateTotalMoneySpent(0);
    }

    //returns the list of teachers
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    //adds a teacher to the school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    //returns the list of students
    public ArrayList<Student> getStudents() {
        return students;
    }

    //adds a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    //returns the total money earned by school
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    //updates the total money earned by school
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    //returns the total money spent by the school
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    //updates the money spent by the school (just salaries of the teachers)
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
