package test5june.validation;

import test5june.dao.Storage;
import test5june.model.Department;
import test5june.model.Faculty;

import java.util.List;

public class Validation {
    public static boolean checkIfFacultyExists(Faculty faculty){
        List<Department> departmentList = Storage.getNsbtCollegeStorage().getcDepts();

        for (Department department: departmentList){
            if (department.getdFaculty().getName().equals(faculty.getName()) && department.getdFaculty().getExperience() == faculty.getExperience()){
                return true;
            }
        }
        return false;
    }

    public static boolean isValidName(String name) {
        //if any character other than Alphabets and space is found then it is not a valid name
        if (name.contains("[^a-zA-z\\s]")){
            return false;
        }
        return true;
    }

    public static boolean isValidGender(char gender) {
        //if any character other than Alphabets and space is found then it is not a valid name
        String genderStr = Character.toString(gender);
        if (genderStr.equalsIgnoreCase("M") || genderStr.equalsIgnoreCase("F")){
            return true;
        }
        return false;
    }

}
