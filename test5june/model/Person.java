package test5june.model;

public class Person{
    private String name;
    private char gender;
    private String state;

    //constructor
    public Person(String name, char gender, String state) {
        this.name = name;
        this.gender = gender;
        this.state = state;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", state='" + state + '\'' +
                '}';
    }
}
