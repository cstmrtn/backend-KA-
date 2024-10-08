package zoo;

public abstract class Animal {
    String name;
    int age;
    boolean gender;
    //true == ferfi


    public String getName(){
        return this.name;

    }

    abstract String breed();

    abstract void sound();

    abstract boolean isLandAnimal();
}