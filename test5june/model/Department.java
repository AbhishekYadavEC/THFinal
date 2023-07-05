package test5june.model;

import test5june.exception.InvalidGenderException;
import test5june.exception.InvalidNameException;
import test5june.exception.StudentAlreadyExistsException;
import test5june.validation.Validation;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String dName;
    private int dCapacity;
    private Faculty dFaculty;
    private List<Student> dStudents;

    //constructor
    public Department(String dName, int dCapacity, Faculty dFaculty) {
        dStudents = new ArrayList<>();
        this.dName = dName;
        this.dCapacity = dCapacity;
        this.dFaculty = dFaculty;
    }

    //getters and setters
    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public int getdCapacity() {
        return dCapacity;
    }

    public void setdCapacity(int dCapacity) {
        this.dCapacity = dCapacity;
    }

    public Faculty getdFaculty() {
        return dFaculty;
    }

    public void setdFaculty(Faculty dFaculty) {
        this.dFaculty = dFaculty;
    }

    public List<Student> getdStudents() {
        return dStudents;
    }

    public void setdStudents(List<Student> dStudents) {
        for(Student stu:dStudents){
            addStudent(stu);
        }
    }
    //
    public int addStudent(Student student) {
        if (!Validation.isValidName(student.getName())){ //if validation fails
            throw new InvalidNameException("Invalid name exception: Name should contain only Alphabets");
        }
        if (!Validation.isValidGender(student.getGender())){
            throw new InvalidGenderException("Invalid Gender");
        }
        int noStud = dStudents.size();
        student.setRollNo(++noStud);
        student.setDept(dName);
        //checking if student already exists
        System.out.println("sr:"+dStudents);
        for (Student student1:dStudents){
            System.out.println("t1:"+student1);
            System.out.println("t2:"+student);
            if (student1.equals(student))         //for this we have to override equals method
            throw new StudentAlreadyExistsException("Student :"+student+" already enrolled.");
        }
        dStudents.add(student);
        return dStudents.size();
    }

    public boolean upgradeFaculty(String qualification,Faculty faculty){
        if (qualification.equalsIgnoreCase(faculty.getQualification()) && faculty.getExperience() > dFaculty.getExperience()){
            dFaculty = faculty;
            return true;
        }
        return false;
    }

    public int getStudentCountFromState(String stateName){
        int count = 0;
        for(Student student: dStudents){
            if (student.getState().equalsIgnoreCase(stateName)){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dName='" + dName + '\'' +
                ", dCapacity=" + dCapacity +
                ", dFaculty=" + dFaculty +
                ", dStudents=" + dStudents +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return dCapacity == that.dCapacity && dName.equalsIgnoreCase(that.dName) && dFaculty.equals(that.dFaculty) && dStudents.equals(that.dStudents);
    }
}
