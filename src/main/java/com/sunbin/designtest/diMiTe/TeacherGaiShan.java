package com.sunbin.designtest.diMiTe;

import java.util.ArrayList;
import java.util.List;

public class TeacherGaiShan {
    private String name;

    private String clazz;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public static List<Student> getSudentList() {
        return studentList;
    }

    public static void setSudentList(List<Student> sudentList) {
        TeacherGaiShan.studentList = sudentList;
    }

    private static List<Student> studentList;//学生人数

    public TeacherGaiShan(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public TeacherGaiShan() {

    }

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student("花花", 10, 589));
        studentList.add(new Student("豆豆", 54, 356));
        studentList.add(new Student("秋雅", 23, 439));
        studentList.add(new Student("皮皮", 2, 665));
        studentList.add(new Student("蛋蛋", 19, 502));
    }

    // 总分
    public double clazzTotalScore() {
        double totalScore = 0;
        for (Student stu : studentList) {
            totalScore += stu.getGrade();
        }
        return totalScore;
    }

    // 平均分
    public double clazzAverageScore(){
        double totalScore = 0;
        for (Student stu : studentList) {
            totalScore += stu.getGrade();
        }
        return totalScore / studentList.size();
    }

    // 班级人数
    public int clazzStudentCount(){
        return studentList.size();
    }
}

