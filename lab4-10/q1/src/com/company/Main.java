package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n= 5;
        Color cl = Color.Black;
        Color c2 = Color.Red;
	    Vector<Shape> shape = new Vector<Shape>();
	    shape.add(new Circle(cl));
        shape.add(new Square(c2 ,n));
        shape.add(new Triangle(c2));
        for (int i = 0; i < shape.size();i++ )
            shape.get(i).draw();
    }
}
