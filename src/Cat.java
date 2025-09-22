public class Cat extends Pet{
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Cat() {
        this.breed = "";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String Speak() {
        return "MEOW! I am " + super.getName() + ". I am a " + super.getAge() + " year old "+ breed +".";
    }
}
