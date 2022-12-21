public class Seal extends Animal implements Swim,Spaekable,Runable{
    public Seal(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public Integer runSpeed() {
        return 8;
    }

    @Override
    public String spaek() {
        return "UaUa";
    }

    @Override
    public int swimSpeed() {
        return 14;
    }

    @Override
    public String toString() {
        return "Seal" + super.toString();
    }
}
