package com.company;

public class SquareWithBorders extends Shape{
    private int size;

    SquareWithBorders(int size){
        this.size = size;
    }


    public void print(){
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
                if(i==0 || i==(this.size-1) || j==0 || j==(this.size-1)){
                    System.out.print("o");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print('\n');
        }
    }
}
