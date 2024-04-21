public class Student
{
    private String name;
    private int cohort;
    private boolean honors;
    
    public Student(String Name, int grade, boolean hons)
    {
        name = Name;
        cohort = grade;
        honors = hons;
    }

    private String honString = honors ? "" : " honors ";
    
    public String toString()
    {
        return name + " is a " + cohort + honString + " student!";
    }
}
