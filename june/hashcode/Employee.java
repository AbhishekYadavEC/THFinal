package june.hashcode;

import java.util.Objects;

public class Employee {
    private int empId;
    private String empName;
    private String city;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && empName.equals(employee.empName);
    }

    @Override
    public int hashCode() {
//        System.out.println("h:"+Objects.hash(empId, empName));
        return Objects.hash(empId, empName);
//        return 111;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
