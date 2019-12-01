package lesson6;

public class Animal {
    private String Name;
    private Integer age;
    private String color;

    public Animal(String name, Integer age, String color) {
        Name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void show() {
        System.out.println("Name: "+Name+", age: "+age+", color: "+color);
    }
}
