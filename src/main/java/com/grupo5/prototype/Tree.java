package com.grupo5.prototype;

public abstract class Tree {
    private double mass;
    private double height;
    private String position;

    public Tree(double mass, double height) {
        this.mass = mass;
        this.height = height;
        this.position = "Desconhecido"; 
    }

    public double getMass() {
        return mass;
    }

    public double getHeight() {
        return height;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public abstract Tree copy();
}
