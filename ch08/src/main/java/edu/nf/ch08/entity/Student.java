package edu.nf.ch08.entity;

import lombok.Data;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

@Data
public class Student {
    private Integer stuId;
    private String stuName;
    private Integer stuAge;

    private ClassInfo classInfo;
    private IdCard idCard;
    private List<Subject> subjects = new ArrayList<>();
}
