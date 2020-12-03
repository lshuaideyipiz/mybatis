package edu.nf.ch08.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClassInfo {
    private Integer cid;
    private String className;

    private List<Student> students = new ArrayList<>();
}
