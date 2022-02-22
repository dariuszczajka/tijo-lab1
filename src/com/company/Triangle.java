package com.company;

public class Triangle extends Shape{
    private int size;

    Triangle(int size){
        this.size = size;
    }


    public void print(){
        for(int i=0;i<this.size;i++){
            for(int j=0;j<=i;j++){
                System.out.print("o");
            }
            System.out.print('\n');
        }
    }
}
