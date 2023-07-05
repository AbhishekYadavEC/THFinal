package testjune12;

import testjune12.dao.Nsbt;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Trainee {
    private int id;
    private String name;
    private String contactNo;
    private double tenthPercent;
    private double twelfthPercent;
    private double gradPercent;
    private String collegeName;

    private List<Assignment> assignmentList;

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }

    public Trainee(int id, String name, String contactNo) {
        assignmentList = new ArrayList<>();
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
    }

    //addAssignmentToTrainee()
    public void addAssignmentToTrainee(Assignment assignment){
        //check if this assignment is already assigned to the trainee
        if (assignmentList.contains(assignment)) {
            System.out.println("Assignment is already assigned to trainee.");
            return;
        }

        //if got same assignment with different date then replace the previous one.
        for (Assignment assign:assignmentList){
            if (assign.getName().equalsIgnoreCase(assignment.getName()) && assign.getQuesList().equals(assignment.getQuesList())){
                assignmentList.remove(assign);
                assignmentList.add(assignment);
                return;
            }
        }

        //adding new assignment
        assignmentList.add(assignment);
        Nsbt.addAssignment(assignment); //also add to db if not present
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

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public double getTenthPercent() {
        return tenthPercent;
    }

    public void setTenthPercent(double tenthPercent) {
        this.tenthPercent = tenthPercent;
    }

    public double getTwelfthPercent() {
        return twelfthPercent;
    }

    public void setTwelfthPercent(double twelfthPercent) {
        this.twelfthPercent = twelfthPercent;
    }

    public double getGradPercent() {
        return gradPercent;
    }

    public void setGradPercent(double gradPercent) {
        this.gradPercent = gradPercent;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return id == trainee.id && Double.compare(trainee.tenthPercent, tenthPercent) == 0 && Double.compare(trainee.twelfthPercent, twelfthPercent) == 0 && Double.compare(trainee.gradPercent, gradPercent) == 0 && Objects.equals(name, trainee.name) && Objects.equals(contactNo, trainee.contactNo) && Objects.equals(collegeName, trainee.collegeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, contactNo, tenthPercent, twelfthPercent, gradPercent, collegeName);
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", tenthPercent=" + tenthPercent +
                ", twelfthPercent=" + twelfthPercent +
                ", gradPercent=" + gradPercent +
                ", collegeName='" + collegeName + '\'' +
                ", assignmentList=" + assignmentList +
                '}';
    }
}
