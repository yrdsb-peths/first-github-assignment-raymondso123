public class Student
{
    private String name;
    private int cohort;
    private boolean honors;
    private int hours;
    
    public Student(String Name, int grade, boolean hons, int hrs)
    {
        name = Name;
        cohort = grade;
        honors = hons;
        hours = hrs;
    }

    private String honString = honors ? "" : " honors";
    
    public String toString()
    {
        return name + " is a grade " + cohort + honString + " student with " + hours + " of volunteering experience!";
    }
}
