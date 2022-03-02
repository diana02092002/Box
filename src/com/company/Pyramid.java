package com.company;

public class Pyramid extends Shape{
    private double h;
    private double s; // площадь основания

    public Pyramid(double h, double s) {
        super(h * s * 4 / 3);
        this.h = h;
        this.s = s;
    }
}
