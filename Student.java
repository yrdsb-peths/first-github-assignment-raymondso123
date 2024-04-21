public class Student
{
    private String name;
    private int cohort;
    
    public Student(String Name, int grade)
    {
        name = Name;
        cohort = grade;
    }
    
    public String toString()
    {
        return name + " is a " + cohort + " student!";
    }
}
