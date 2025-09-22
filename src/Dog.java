public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog() {
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
        return "Woof! I am " + super.getName() + ". I am a " + super.getAge() + " year old "+ breed +".";
    }
}
