package june.hashcode;

import java.util.HashMap;
import java.util.Map;

public class CheckClass {
    public static void main(String[] args) {
        Map<Employee, Data> employeeDepartmentMap = new HashMap<>();
        Employee e1 = new Employee(1,"Thamesh");
        System.out.println("e1 hashocde:"+e1.hashCode());
        Employee e2 = new Employee(1,"Thamesh");
        System.out.println("e2 hashocde:"+e2.hashCode());
        Employee e3 = new Employee(2,"Hari");
        System.out.println("e3 hashocde:"+e3.hashCode());

        Employee e4 = new Employee(3,"Satyam");
        System.out.println("e4 hashocde:"+e4.hashCode());

        employeeDepartmentMap.put(new Employee(1,"Thamesh"), new Data(11,"IT","Delhi"));
        employeeDepartmentMap.put(new Employee(1,"Thamesh"), new Data(12,"CS","Delhi"));
        employeeDepartmentMap.put(new Employee(2,"Hari"), new Data(13,"EC","JK"));

        employeeDepartmentMap.forEach((k,v)->System.out.println(k.hashCode()+" -> "+v.hashCode()));
    }

}
