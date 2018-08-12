package com.cgm.internship.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Producer producer1 = new Producer(1,"H&M");

        Tshirt tshirtOne = new Tshirt();
        tshirtOne.setSize("M");
        tshirtOne.setColor("White");
        tshirtOne.setMadeIn("China");
        tshirtOne.setMaterial("Cotton");
        tshirtOne.setType("Slim-fit");
        tshirtOne.setProducer(producer1);
        System.out.println(tshirtOne.toString());


        //new way of creating a new t-shirt using prototype pattern
        Tshirt tshirtTwo = (Tshirt) tshirtOne.clone();
        tshirtTwo.setColor("Yellow");
        System.out.println(tshirtTwo.toString());


        System.out.println("=====shallow & deep copy=====");
        tshirtOne.getProducer().setName("ZARA");
        System.out.println(tshirtOne);
        System.out.println(tshirtTwo);
     }
}
