package testjune12;

import testjune12.dao.Nsbt;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private int id;
    private String name;
    private String email;

    private List<Trainee> traineeList;
    public Trainer(int id, String name, String email) {
        traineeList = new ArrayList<>();
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //addTraineeToTrainer()
    public void addTraineeToTrainer(Trainee trainee){
        //if trainee already assigned
            if (traineeList.contains(trainee)) {
                System.out.println("trainee already present");
                return;
            }


        //new trainee
        traineeList.add(trainee);
        Nsbt.addTrainee(trainee); //also add to db
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", traineeList=" + traineeList +
                '}';
    }
}
