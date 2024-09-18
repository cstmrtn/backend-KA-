class People{
    String name;
    int age;
    boolean gender;

    public void getGoal(){
        System.out.println("Célom: Élj a pillanatnak!");
    }

    public void  introduce()
    {

        if (gender)
        {
            System.out.printf("Szia, %s vagyok, %d éves férfi.", this.name, this.age);
        }
        else {
            System.out.printf("Szia, %s vagyok, %d éves nő.", this.name, this.age);
        }
    }
}

public class main{
    public static void main(String[] args) {
        People pp = new People();
        pp.age = 18;
        pp.name = "Laci";
        pp.gender = true;
        pp.introduce();
        pp.getGoal();
        People pp2 = new People();
        pp2.age = 30;
        pp2.name = "Karolina";
        pp2.gender = false;
        pp2.introduce();
        pp2.getGoal();
        People pp3 = new People();
        pp3.age = 32;
        pp3.name = "Norbert";
        pp3.gender = true;
        pp3.introduce();
        pp3.getGoal();
    }
}