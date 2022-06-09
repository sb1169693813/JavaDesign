package com.sunbin.designtest;

import com.sunbin.designtest.kaiBiYuanZe.CalculationArea;
import com.sunbin.designtest.kaiBiYuanZe.CalculationAreaExt;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculationAreaTest {
    @Test
    public void test_rectangle() {
        CalculationArea calculationArea = new CalculationArea();
        System.out.println(calculationArea.rectangle(1.0, 2.0));
    }

    @Test
    public void test_triangle() {
        CalculationArea calculationArea = new CalculationArea();
        System.out.println(calculationArea.triangle(1.0, 2.0, 3.0));
    }

    @Test
    public void test_circular() {
        CalculationArea calculationArea = new CalculationArea();
        System.out.println(calculationArea.circular(4.0));
        CalculationAreaExt calculationAreaExt = new CalculationAreaExt();
        System.out.println(calculationAreaExt.circular(4.0));
    }
}
