package com.sunbin.designtest.kaiBiYuanZe;

public interface ICalculationArea {
    /**
     * 计算面积，长方形
     *
     * @param x
     * @param y
     * @return
     */
    double rectangle(double x, double y);

    /**
     * 计算面积，三角形
     *
     * @param x
     * @param y
     * @param z
     * @return
     */
    double triangle(double x, double y, double z);

    /**
     * 计算面积，圆形
     *
     * @param r
     * @return
     */
    double circular(double r);
}
