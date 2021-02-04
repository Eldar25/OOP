package com.company;

public class Order {
    private String order;

    public Order(){}

    public  Order(String order){
        this.order = order;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order='" + order + '\'' +
                '}';
    }

}
