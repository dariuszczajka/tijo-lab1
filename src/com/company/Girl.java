package com.company;

import java.util.LinkedList;

class Girl {
    private LinkedList<Flower> flowers;
    private short age;

   Girl(short age){
       flowers = new LinkedList<Flower>();
       this.age = age;
   }

    public LinkedList<Flower> getFlowers() {
        return flowers;
    }

    public void giveFlower(Flower flower) {
        this.flowers.add(flower);
    }

    public short getAge() {
        return age;
    }
}
