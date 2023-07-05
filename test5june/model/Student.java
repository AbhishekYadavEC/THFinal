package test5june.model;

public class Student extends Person{
    private int rollNo;
    private String dept;

    public Student(String name, char gender, String state){
        super(name,gender,state);
    }

    //getters and setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    //overriding equals so that we can check equality of two Student
    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}

        if (o == null || getClass() != o.getClass()){return false;} //using getClass() here to check if this Object o is of different type then return false.
        Student student = (Student) o;
        return getName().equals(student.getName()) &&  dept.equalsIgnoreCase(student.dept);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", dept='" + dept + '\'' +
                "} " + super.toString();
    }
}
