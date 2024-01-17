public class Person {
    String firstName;
    String lastName;
    int age;
    double salary;
    boolean isMarried;
    String[] hobbies;

    // Person sınıfı için firstname, lastname ve age değerlerini alabileceğim
    // bir constructor tanımlayalim.

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //OVERLOADING:
    public Person(String firstName, String lastName, int age, double salary, boolean isMarried, String[] hobbies){
        this(firstName, lastName, age);
    }
}


