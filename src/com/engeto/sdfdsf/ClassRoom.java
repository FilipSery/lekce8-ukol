package com.engeto.sdfdsf;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ClassRoom implements Interface{
    private final String hashtags = "###############################";
    private String name;
    private String year;
    private Teacher classTeacher;
    private List<Student> studentsList = new ArrayList();
    private int numberOfStudents;

    public ClassRoom(String name, String year, Teacher classTeacher) {
        this.name = name;
        this.year = year;
        this.classTeacher = classTeacher;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getClassTeacher() {
        return classTeacher.getFullName();
    }

    public void setClassTeacherName(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }

    public int getNumberOfStudents() {
        return studentsList.size();
    }

    @Override
    public void getStudentsList() {
        for (Student s : studentsList) {
            System.out.println(s.getStudentsInfo1());
        }
    }

    @Override
    public void addStudentToList(Student student) {
        studentsList.add(student);
    }

    public String getClassInfo1 () {
        String classInfo = "\n"+"Třída: "+year+"."+name+" (ročník: "+year+")"+"\n"+
                "Třídní učitel: "+classTeacher.getSurname()+", "+classTeacher.getName()+
                "\n"+"Počet studentů: "+getNumberOfStudents()+"\n";
        String students = "";
        for (Student s : studentsList) {
            students+= "\n"+s.getStudentsInfo1();
        }
        return hashtags + classInfo + "\n"+ hashtags+students;

    }
    public String getClassInfo2 () {
        String classInfo = "\n"+year+"."+name+", "+classTeacher.getFullName();
        String students = "";
        for (Student s : studentsList) {
            students+= "\n"+s.getStudentsInfo2();
        }
        return classInfo+students;
    }
    public String getClassInfo3 () {
        String classInfo = "\n Třída: "+year+"."+name+"\n Třídní učitel: "+classTeacher.getFullName()+"\n Seznam žáků:";
        String students = "";
        for (Student s : studentsList) {
            students+= "\n"+s.getStudentsInfo3();
        }
        return classInfo+students;
    }
    public void saveClassInfoToFile (String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.write(getClassInfo3());
        } catch (IOException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}

