public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String Name, String Breed, int Age) {
        name = Name;
        breed = Breed;
        age = Age;
    }

    public String toString() {
        return "The " + age + " year old " + breed + " is called " + name + "!";
    }
}
