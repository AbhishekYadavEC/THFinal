package testjune12;

import testjune12.dao.Nsbt;

import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List<String> quesList = new ArrayList<>();
        quesList.add("what is multithreading?");
        quesList.add("explain lifecycle of thread?");

        List<String> collectionQuesList = new ArrayList<>();
        quesList.add("what is collection?");
        quesList.add("linkedlist vs arraylist?");
        quesList.add("what is set");

        Assignment assignment1 = new Assignment("Exception handling",quesList, LocalDate.parse("2023-06-20"));
        Assignment assignment2 = new Assignment("Collections",collectionQuesList, LocalDate.parse("2023-06-22"));

        //
        Nsbt.addAssignment(assignment1);

        Trainer functionalTrainer1 = new FunctionalTrainer(12345,"Ajy","fdsfk@gmail.com");
        TechnicalTrainer technicalTrainer1 = new TechnicalTrainer(23456,"Raju","fdsfk@gmail.com");

        //
        Nsbt.addTrainer(functionalTrainer1);
        Nsbt.addTrainer(technicalTrainer1);

        Trainee trainee1 = new Trainee(11,"Thamesh","6262746636");
        Trainee trainee2 = new Trainee(12,"Vikas","4344344344");
        Trainee trainee3 = new Trainee(13,"Ayush","6767879087");
        //
        Nsbt.addTrainee(trainee1);
        Nsbt.addTrainee(trainee2);
        Nsbt.addTrainee(trainee3);

        //
        trainee1.addAssignmentToTrainee(assignment2);
        trainee2.addAssignmentToTrainee(assignment1);

        //
        technicalTrainer1.addTraineeToTrainer(trainee1);
        technicalTrainer1.addTraineeToTrainer(trainee3);


        //given the list of assignment id find the list of trainees doing the assignments
        System.out.println("Trainees doing assignment 1:");
        System.out.println(Nsbt.traineesDoingAssignment(1));
        System.out.println();

        //
        System.out.println("All the trainers");
        System.out.println(Nsbt.trainersList);
        System.out.println("Registered trainees");
        System.out.println(Nsbt.registeredTrainees);
        System.out.println("All assignments");
        System.out.println(Nsbt.assignmentList);
    }
}
