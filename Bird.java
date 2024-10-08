package zoo;

public class Bird extends Animal{

    String breed;
    String sound;
    boolean isLandAnimal = false;


    public Bird(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    @Override
    String breed(){
        return null;
    }

    @Override
    void sound(){
        System.out.println(this.sound + " " + this.sound);
    }

    @Override
    boolean isLandAnimal(){
        return isLandAnimal;
    }
    
    public void setSound(String sound){
        this.sound = sound;
    }
    public void setIslandAnimal(boolean isLandAnimal){
        this.isLandAnimal = isLandAnimal;
    }

}