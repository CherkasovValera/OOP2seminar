public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Murka",4,"Andrey"))
                .addAnimal(new Dog("Sharik", 4, "Oleg"))
                .addAnimal(new Duck("Donald",2,"Igor"))
                .addAnimal(new Fish("Nemo",0,"Sacha"))
                .addAnimal(new Seal("Kotik",3,"Zoopark"))
                .addAnimal((new Eagle("Berkut",2, "Ivan")));
        System.out.println("Зоопарк");
        System.out.println(zoo.toString()+"\n");
        System.out.println("Разговор");
        System.out.println((zoo.talk()));
        System.out.println("Скорость бега");
        for (Runable i: zoo.getRunable()) {
            System.out.println(i.runSpeed());
        }
        System.out.println("Чемпионы по бегу");
        System.out.println(zoo.getChampionSpeed());
        System.out.println("Скорость полета");
        for (Flyable i: zoo.getFlyable()) {
            System.out.println(i.flySpeed());
        }
        System.out.println("Скорость плавания");
        for (Swim i: zoo.getSwim()) {
            System.out.println(i.swimSpeed());
        }
        Savermanager savermanager= new Savermanager();
        savermanager.sever(zoo.getAnimals());
    }
}