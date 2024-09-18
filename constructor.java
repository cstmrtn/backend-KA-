class Person{
    int age;
    String name;
    String gender;

    public Person(int age, String name, String gender) {
        this.age = 30;
        this.name = "Jane Doe";
        this.gender = "female";
    }

    public void printDetails(){
        System.out.println("Age is "+this.age);
        System.out.println("Name is "+this.name);
        System.out.println("Gender is "+this.gender);
    }

}
public class constructor {
    public static void main(String[] args) {
        Person com1 = new Person(18, "Laci", "Male");
        System.out.println(com1.age);
        System.out.println(com1.name);
        System.out.println(com1.gender);
    }
}