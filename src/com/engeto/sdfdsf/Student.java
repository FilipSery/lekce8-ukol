package com.engeto.sdfdsf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Student extends Teacher {
    private int dateOfBirth;
    private int studentsNumber;
    private String studentsId;

    public Student(String name, String surname, int dateOfBirth, int studentsNumber, String studentsId) {
        super(name, surname);
        this.dateOfBirth = dateOfBirth;
        this.studentsNumber = studentsNumber;
        this.studentsId = studentsId;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getStudentNumber() {
        return studentsNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentsNumber = studentNumber;
    }

    public String getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(String studentsId) {
        this.studentsId = studentsId;
    }
    public String getFullStudentsName() {
        return getName()+" "+getSurname();
    }

    public String getStudentsInfo1 () {
        return "# "+studentsNumber+" # "+studentsId+" - "+getFullStudentsName()+" ("+dateOfBirth+")";

    }
    public String getStudentsInfo2 () {
        return studentsId+", "+ getFullStudentsName();
    }
}

