package JavaPractice01.StreamTests.ObjectStream.dept;

import java.io.Serializable;

public class Dept implements Serializable {
    String deptId;
    String deptName;
    int sYear;

    public Dept(String id, String name, int year){
        deptId = id;
        deptName = name;
        sYear = year;
    }

    public String getDeptId(){
        return this.deptId;
    }

}
