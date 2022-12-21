public class Duck extends Animal implements Flyable,Spaekable,Runable,Swim{
    public Duck(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 50;
    }

    @Override
    public Integer runSpeed() {
        return 5;
    }

    @Override
    public String spaek() {
        return "Krya";
    }

    @Override
    public int swimSpeed() {
        return 5;
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }
}
