

import java.util.Scanner;


abstract class Shape{
    final double pi = 3.14;

    float area;
    abstract void input();
    abstract void compute();
    void disp(){
        System.out.println("The area is: " + area);
    }
}

class Rectangle extends Shape{
    float height;
    float base;

    public void input() {
        System.out.println("Square calculation");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give the height of the Square");
        height = scan.nextFloat();
        System.out.println("Please give the base");
        base = scan.nextFloat();
    }
    void compute() {
        area = base * height;
    }
}

class Square extends Shape {
    float sides;
    public void input(){
        System.out.println("Square Calculations");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the sides of the Square");
        sides = scan.nextFloat();
    }
    public void compute(){
        area = (sides * sides);
    }
}

class Circle extends Shape{
    float radius;

    void input() {
        System.out.println("Circle Calculation");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please entere the radius of the Circle");
        radius = scan.nextFloat();

    }
    void compute() {
        area = (float)pi * radius * radius;
    }
}

class Calculations {
    void computations(Shape shapes) {
        shapes.input();
        shapes.compute();
        shapes.disp();
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Square sq = new Square();
        Circle cr = new Circle();

        Calculations cl = new Calculations();
        cl.computations(rec);
        cl.computations(sq);
        cl.computations(cr);
    }
}