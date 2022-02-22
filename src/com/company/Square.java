package com.company;

public class Square extends Shape {
    private int size;

    Square(int size){
        this.size = size;
    }

    public void print(){
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
                System.out.print("o");
            }
            System.out.print('\n');
        }
    }
}
