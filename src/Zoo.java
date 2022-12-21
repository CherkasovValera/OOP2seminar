import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Animal> getAnimals() {
        return animals;
    }

    private List<Animal> animals = new ArrayList<>();

    public Zoo addAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }

    public String talk() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Spaekable item : getSpaekable()) {
            stringBuilder.append(item.spaek() + "\n");

        }
        return stringBuilder.toString();
    }

    private List<Spaekable> getSpaekable() {
        List<Spaekable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Spaekable) {
                result.add((Spaekable) item);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runable) {
                result.add((Runable) item);
            }
        }
        return result;
    }
    public int getChampionSpeed(){
        int max =0;
        for (Runable item:getRunable()){
            if(item.runSpeed()>max){
                max = item.runSpeed();
            }
        }
        return max;
    }
    public List<Flyable> getFlyable(){
        List<Flyable> flyables= new ArrayList<>();
        for (Animal item:animals) {
            if (item instanceof Flyable) {
                flyables.add((Flyable) item);
            }
        }
        return flyables;
    }
    public List<Swim> getSwim(){
        List<Swim> swims= new ArrayList<>();
        for (Animal item:animals) {
            if (item instanceof Swim) {
                swims.add((Swim) item);
            }
        }
        return swims;
    }
}
