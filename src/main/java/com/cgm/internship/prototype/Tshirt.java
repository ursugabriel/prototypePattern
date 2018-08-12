package com.cgm.internship.prototype;

public class Tshirt implements Cloneable {
    private String size;
    private String color;
    private String madeIn;
    private String material;
    private String type;
    private Producer producer;

    public Tshirt(String size, String color, String madeIn, String material, String type, Producer producer) {
        this.size = size;
        this.color = color;
        this.madeIn = madeIn;
        this.material = material;
        this.type = type;
        this.producer = producer;
    }

    public Tshirt() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    //shallow copy example
    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            return super.clone();
        }
        catch (CloneNotSupportedException exception){
            System.out.println("Object not found!");
            return null;
        }
    }
    //deep copy example
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        try{
//            Tshirt tshirtClone = (Tshirt) super.clone();
//            Producer producerClone = new Producer(this.producer.getId(),this.producer.getName());
//            tshirtClone.setProducer(producerClone);
//            return tshirtClone;
//        }
//        catch (CloneNotSupportedException exception){
//            System.out.println("Object not found!");
//            return null;
//        }
//    }



    @Override
    public String toString() {
        return "T-shirt details: " +
                "size: " + size +
                ", color: "  + color  +
                ", madeIn: " + madeIn  +
                ", material: " + material +
                ", type: " +type +
                ", producer: " +producer.getName();
    }
}
