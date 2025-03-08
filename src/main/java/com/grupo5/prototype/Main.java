package com.grupo5.prototype;

public class Main {
    public static void main(String[] args) {
       
        PlasticTree originalPlasticTree = new PlasticTree(5.0, 10.0);
        originalPlasticTree.setPosition("Jardim");

        PlasticTree clonedPlasticTree = originalPlasticTree.copy(); 

        System.out.println("Massa da árvore clonada: " + clonedPlasticTree.getMass());
        System.out.println("Altura da árvore clonada: " + clonedPlasticTree.getHeight());
        System.out.println("Posição da árvore clonada: " + clonedPlasticTree.getPosition());

        System.out.println("-----------------------------");

        PineTree originalPineTree = new PineTree(8.0, 15.0);
        originalPineTree.setPosition("Montanha");

        PineTree clonedPineTree = originalPineTree.copy();

        System.out.println("Massa do pinheiro clonado: " + clonedPineTree.getMass());
        System.out.println("Altura do pinheiro clonado: " + clonedPineTree.getHeight());
        System.out.println("Posição do pinheiro clonado: " + clonedPineTree.getPosition());
    }
}
