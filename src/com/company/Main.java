package com.company;

public class Main {
    public static void main(String[] args) {
        short age = 33;
        Girl monicaBellucci = new Girl(age);

        monicaBellucci.giveFlower(new Rose());
        monicaBellucci.getFlowers();
        monicaBellucci.getAge();

        //////////////////////////////////

        Square square = new Square(5);
        Triangle triangle = new Triangle(5);
        SquareWithBorders sqb = new SquareWithBorders(5);

        printShape(square);
        System.out.print('\n');
        printShape(triangle);
        System.out.print('\n');
        printShape(sqb);
    }

    public static void printShape(Shape shape){
        shape.print();
    }

}