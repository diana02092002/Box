package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
            Ball ball = new Ball(4.5);
            Cylinder cylyinder = new Cylinder(2, 2);
            Pyramid pyramid = new Pyramid(100, 100);

            Box box = new Box(1000);

            System.out.println(box.add(ball)); // true
            System.out.println(box.add(cylyinder)); // true
            System.out.println(box.add(pyramid)); // false
        }
    }