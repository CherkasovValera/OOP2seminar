public class Eagle extends Animal implements Spaekable,Flyable,Runable{
    public Eagle(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 80;
    }

    @Override
    public Integer runSpeed() {
        return 3;
    }

    @Override
    public String spaek() {
        return "gak";
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }
}
