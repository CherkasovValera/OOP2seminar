public class Dog extends Animal implements Spaekable, Runable{

    public Dog(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String spaek() {
        return "WAW";
    }

    @Override
    public Integer runSpeed() {
        return 40;
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}
