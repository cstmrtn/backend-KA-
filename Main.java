package zoo;

public class Main {
    public static void main(String[] args) {
    Bird myBird = new Bird("Fecske", "Fecske", 5);
    Mammal myMammal = new Mammal("Luna", "szürke farkas", 10);
    Reptile myReptile = new Reptile("Csúszka", "Kígyó", 2);

    myBird.setSound("krau krau");
    myMammal.setSound("WAU WAU AUUUU");
    myReptile.setSound("szzzzzzz");

    myBird.setIslandAnimal(true);
    myMammal.setIslandAnimal(true);
    myReptile.setIslandAnimal(true);

    System.out.println(myBird.name + " hangja: " + myBird.sound);
    }
}
