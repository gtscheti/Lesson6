package lesson6;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Cat Pushok = new Cat("Pushok", 18.5, "white", 4500);
        Animal Barsik = new Animal("Barsik", 5, "grey");
        Animal Dog = new Animal ("Dog", 4, "white");
        Pushok.show("Pushok itinial");
        Barsik.show("Barsik initial");
        BeanUtils ass = new BeanUtils();
        ass.assign(Pushok, Barsik);
        Pushok.show("Barsik to Pushok");
        Pushok.setAge(7.5);
        Pushok.setColor("blue");
        ass.assign(Dog, Pushok);
        Dog.show("Pushok to Dog");
    }

}
