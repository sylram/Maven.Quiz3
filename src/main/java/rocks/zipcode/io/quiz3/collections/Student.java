package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student extends Lab {
    Map<Lab, LabStatus> map;
    String labName;

    public Student() {
//        this(null);
    }

    public Student(Map<Lab, LabStatus> map) {
        this.map = new HashMap<>();
    }

    public Lab getLab(String labName) {
        Lab find = null;
        for(Lab lab: map.keySet()){
            if(map.get(lab).equals(labName)){
                find = lab;
            }
        }
        return find;

    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        map.put(getLab(labName),labStatus);

    }


    public void forkLab(Lab lab) {
        map.put(lab,LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        return map.get(getLab(labName));
    }
}
