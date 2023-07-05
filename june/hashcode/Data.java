package june.hashcode;

import java.util.Objects;

public class Data {
    private int no;
    private String name;
    private String city;

    public Data(int no, String name, String city) {
        this.no = no;
        this.name = name;
        this.city = city;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    @Override
    public String toString() {
        return "Data{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
