class People{
    private  String name;
    private  int age;
    private boolean gender;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int  age) {
        this.age = age;
    }

    public boolean  getGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }





    public   void getGoal(){
        System.out.println("Célom: Élj a pillanatnak!");
    }

    public   void  introduce()
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

public  class Modifier{
    public static void main(String[] args) {
        People pp = new People();
        pp.setAge(18);
        pp.setName("Laci");
        pp.setGender(true);
        pp.introduce();
        pp.getGoal();
        People pp2 = new People();
        pp2.setAge(38);
        pp2.setName("Karolina");
        pp2.setGender(false);
        pp2.introduce();
        pp2.getGoal();
        People pp3 = new People();
        pp3.setAge(12);
        pp3.setName("Ármin");
        pp3.setGender(true);
        pp3.introduce();
        pp3.getGoal();
    }
}
