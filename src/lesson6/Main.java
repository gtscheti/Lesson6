package lesson6;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Cat Pushok = new Cat("Pushok", 18.5, "white", 4500);
        Animal Barsik = new Animal("Barsik", 5, "grey");
        Pushok.show();
        Barsik.show();
        BeanUtils ass = new BeanUtils();
        ass.assign(Pushok, Barsik);
        Pushok.show();
        Pushok.setAge(7);
        ass.assign(Barsik, Pushok);
        Barsik.show();
    }

}
