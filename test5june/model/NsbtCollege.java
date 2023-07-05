package test5june.model;

import test5june.exception.SameDepartmentExists;
import test5june.validation.Validation;

import java.util.ArrayList;
import java.util.List;

public class NsbtCollege {
    private String cName;
    private String cCity;
    private List<Department> cDepts;

    //Constructor
    public NsbtCollege(String cName, String cCity) {
        cDepts = new ArrayList<>();
        this.cName = cName;
        this.cCity = cCity;
    }

    //getters and setters
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity;
    }

    public List<Department> getcDepts() {
        return cDepts;
    }

    public void setcDepts(List<Department> cDepts) {
        this.cDepts = cDepts;
    }

    //
    public int addDepartment(String dName, int capacity, Faculty faculty){
        //checking if the department with same name already exists
        for (Department dept:cDepts){
            if(dept.getdName().equals(dName))
                throw new SameDepartmentExists("Dept with the name already exists.");
        }
        //if same faculty exists in that department
        if (!Validation.checkIfFacultyExists(faculty)) {
            System.out.println("Same Faculty already exists.");
        }
        cDepts.add(new Department(dName,capacity,faculty));
        return cDepts.size();
    }

    public int addDepartment(Department department){
        //if department list doesn't contains this department already then only add it to list
        if (!cDepts.contains(department))
            cDepts.add(department);
        else
            throw new SameDepartmentExists("Same department already exists, input the data with updated data.");
        return cDepts.size();
    }


    @Override
    public String toString() {
        return "NsbtCollege{" +
                "cName='" + cName + '\'' +
                ", cCity='" + cCity + '\'' +
                ", cDepts=" + cDepts +
                '}';
    }
}
