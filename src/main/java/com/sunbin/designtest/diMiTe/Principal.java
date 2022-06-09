package com.sunbin.designtest.diMiTe;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    private Teacher teacher = new Teacher("丽华", "3年1班");

//    查询班级信息，总分数、学生人数、平均值
    public Map<String, Object> queryClazzInfo() {
        int stuCount = this.clazzStudentCount();
        double totalScore = this.clazzTotalScore();
        double averageScore = this.clazzAvergaeScore();


        Map<String, Object> mapObj = new HashMap<>();
        mapObj.put("班级", teacher.getClazz());
        mapObj.put("老师", teacher.getName());
        mapObj.put("学生人数", stuCount);
        mapObj.put("班级总分数", totalScore);
        mapObj.put("班级平均分", averageScore);

        return mapObj;
    }


    //总分数
    public double clazzTotalScore() {
        double totalScore = 0;
        for (Student student: teacher.getSudentList()) {
            totalScore += student.getGrade();
        }

        return totalScore;
    }

    //平均值
    public double clazzAvergaeScore() {
        double totalScore = this.clazzTotalScore();

        return totalScore / clazzStudentCount();
    }



    //班级人数
    public int clazzStudentCount() {
        return teacher.getSudentList().size();
    }
}
