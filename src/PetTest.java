public class PetTest {
    public static void main(String[] args) {
        Pet Sally = new Pet("Sally The Parrot", 8);
        Cat Shadow = new Cat("Shadow", 13, "Scottish Fold");
        Dog Sasha = new Dog("Sasha", 3, "German Shepherd");

        System.out.println(Sasha.Speak());
        System.out.println(Shadow.Speak());
        System.out.println(Sally.Speak());
    }

}

