package com.company.Kolekcje.Listy.Zadanie6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diary {

    List<Student> studentsList;

    public Diary(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "Diary\n{" +
                "studentsList=" + studentsList +
                "}";
    }

    public void addStudent(Student... student) {
        studentsList.addAll(Arrays.asList(student));

    }

    public void removeStudent(Student... student) {
        for (Student s : student) {
            studentsList.remove(s);
        }

    }

    public void removeStudent(String indexNumber) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getIndexNumber().equals(indexNumber)) {
                studentsList.remove(studentsList.get(i));
            }
        }
    }

    public Student returnStudent(String indexNumber) {
        Student searchedStudent = new Student();
        for (Student student : studentsList) {
            if (student.getIndexNumber().equals(indexNumber)) {
                searchedStudent = new Student(student.getStudentGrades(), student.getIndexNumber(), student.getName(), student.getSurname());
            }
        }
        return searchedStudent;
    }

    public double studentsGradesAverage(String indexNumber) {
        double sumOfGrades = 0.0;
        int grades = 0;
        for (Student student : studentsList) {
            if (student.getIndexNumber().equals(indexNumber)) {
                for (Double d : student.getStudentGrades()) {
                    sumOfGrades += d;
                    grades++;
                }
            }
        }
        return sumOfGrades / grades;
    }

    public List<Student> studentAtRisk() {

        List<Student> studentsAtRisk = new ArrayList<>();
        for (Student student : studentsList) {
            double sumOfGrades = 0.0;
            int grades = 0;
            for (Double d : student.getStudentGrades()) {
                sumOfGrades += d;
                grades++;
            }
            double average = sumOfGrades / grades;
            if (average < 2) {
                studentsAtRisk.add(student);
            }
        }
        return studentsAtRisk;
    }

}