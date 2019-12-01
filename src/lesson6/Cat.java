package lesson6;

public class Cat {
    private String Name;
    private Number age;
    private String color;
    private Integer weight;

    public Cat(String name, Double age, String color, Integer weight) {
        Name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Number getAge() {
        return age;
    }

    public void setAge(Number age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void show() {
        System.out.println("Name: "+Name+", age: "+age+", color: "+color+", weight: "+weight);
    }
}
