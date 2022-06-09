package com.sunbin.designtest.diMiTe;

import java.util.HashMap;
import java.util.Map;

public class PrincipalGaiShan {
    private TeacherGaiShan teacherGaiShan = new TeacherGaiShan("丽华", "3年1班");

//    查询班级信息，总分数、学生人数、平均值
    public Map<String, Object> queryClazzInfo() {
        int stuCount = teacherGaiShan.clazzStudentCount();
        double totalScore = teacherGaiShan.clazzTotalScore();
        double averageScore = teacherGaiShan.clazzAverageScore();


        Map<String, Object> mapObj = new HashMap<>();
        mapObj.put("班级", teacherGaiShan.getClazz());
        mapObj.put("老师", teacherGaiShan.getName());
        mapObj.put("学生人数", stuCount);
        mapObj.put("班级总分数", totalScore);
        mapObj.put("班级平均分", averageScore);

        return mapObj;
    }

}
