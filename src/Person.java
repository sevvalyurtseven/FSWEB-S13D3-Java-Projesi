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
        this(firstName, lastName, age); //constructor chaining

       //eklediğim özellikler ile ilgili custom bir işlem yapalim:

        if(salary < 11500){
            this.salary = 11500;
        }else{
            this.salary = salary;
        }
        this.isMarried = isMarried;
        this.hobbies = hobbies;
    }

    //getFirstName'in herhangi bir parametre almasina gerek
    // yok cünkü zaten class'in firstName'ini döndüreceğim.
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public  int getAge(){
        return this.age;
    }

    public double getSalary(){
        return salary;
    }

    public boolean isMarried(){
        return isMarried;
    }

    public String[] getHobbies(){
        return hobbies;
    }


    public boolean isTeen(){
        return this.age > 13 && this.age < 19;
    }

}


