public class Fish extends Animal implements Swim{
    public Fish(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int swimSpeed() {
        return 15;
    }

    @Override
    public String toString() {
        return "Fish" + super.toString();
    }
}
