package test5june.main;

import test5june.dao.Storage;
import test5june.model.Department;
import test5june.model.Faculty;
import test5june.model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("------------------------Welcome to NSBT college management system------------------------");
        Student s1 = new Student("Thamesh",'M',"MP");
        Student s2 = new Student("Rajeesh",'M',"UP");
        Student s3 = new Student("Ayush",'M',"Delhi");
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        Faculty faculty1 = new Faculty("Atul",'M',"MP","Mtech",10);
        Faculty faculty2 = new Faculty("Meenakshi",'M',"MP","Phd",5);
        Faculty faculty3 = new Faculty("Meena",'M',"MP","Phd",15);


        Department cse = new Department("Computer Science",200,faculty1);
//        cse.setdStudents(studentList);
        cse.addStudent(new Student("Ajay",'M',"MP"));
        cse.addStudent(s1);
        cse.addStudent(s3);

        //StudentAlreadyException will rise
//        cse.addStudent(s3);
        cse.upgradeFaculty("Phd",faculty3);

        System.out.println(Storage.getNsbtCollegeStorage());

        System.out.println(Storage.getNsbtCollegeStorage().addDepartment("IT",200,faculty2));
        System.out.println(Storage.getNsbtCollegeStorage().addDepartment(cse));

        //
//        System.out.println(Storage.getNsbtCollegeStorage().addDepartment(cse));

        System.out.println(Storage.getNsbtCollegeStorage());
        System.out.println("College Database:"+Storage.getNsbtCollegeStorage());

        //student count from a particular state
        System.out.println("Count of students from MP:"+cse.getStudentCountFromState("MP"));

    }

}
