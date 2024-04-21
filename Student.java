public class Student
{
    private String name;
    private int cohort;
    private Boolean honors;
    
    public Student(String Name, int grade, Boolean hons)
    {
        name = Name;
        cohort = grade;
        honors = hons;
    }

    private honString = honors ? " honors " : "";
    
    public String toString()
    {
        return name + " is a " + cohort + honString + " student!";
    }
}
