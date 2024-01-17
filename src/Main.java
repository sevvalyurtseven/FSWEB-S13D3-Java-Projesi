import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //NOT: Arrays.toString() ile array'in içindeki değerleri
        // stringe cevirip yazdirir.

        Person person1 = new Person("Sevval", "Yurtseven", 24 );
        Person person2 = new Person("John", "Doe", 20 );
        Person person3 = new Person ("Ali", "Veli", 24,
                270000, false, new String[]{"Piano", "Chess"});


        System.out.println("FirstName: " + person1.getFirstName());
        System.out.println("Salary: " + person2.getSalary());
        System.out.println("Hobbies: " + Arrays.toString(person3.getHobbies()));
        System.out.println("FirstName: " + person3.getFirstName());
    }
}