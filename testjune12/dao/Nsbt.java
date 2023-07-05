package testjune12.dao;

import testjune12.Assignment;
import testjune12.Trainee;
import testjune12.Trainer;

import java.util.ArrayList;
import java.util.List;

public class Nsbt {
    public static List<Assignment> assignmentList;
    public static List<Trainee> registeredTrainees;
    public static List<Trainer> trainersList;
    
    static{
        assignmentList = new ArrayList<>();
        registeredTrainees = new ArrayList<>();
        trainersList = new ArrayList<>();
    }

    public static void addAssignment(Assignment assignment){
        if (assignmentList.contains(assignment)){
            System.out.println("Assignment already present in the db.");
            return;
        }
        assignmentList.add(assignment);
    }

    public static void addTrainee(Trainee trainee){
        if (registeredTrainees.contains(trainee)){
            System.out.println("Trainee already present in the db.");
            return;
        }

        registeredTrainees.add(trainee);
    }

    public static void addTrainer(Trainer trainer){
        if (trainersList.contains(trainer)){
            System.out.println("Trainer already present.");
            return;
        }
        trainersList.add(trainer);
    }

    //list of trainees doing a particular assignment
    public static List<Trainee>traineesDoingAssignment(int assignmentId){
        List<Trainee> ans = new ArrayList<>();
        for (Trainee trainee:registeredTrainees){
            List<Assignment> traineesAssignedAsgmt = trainee.getAssignmentList();
            for (Assignment assignment:traineesAssignedAsgmt) {
                if (assignment.getId() == assignmentId) {
                    ans.add(trainee);
                }
            }
        }
        return ans;
    }
}
