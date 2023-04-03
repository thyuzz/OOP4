package org.example;

import java.util.ArrayList;
import java.util.List;

public class VedMach <T>{
    private List<T> vendingMachine;
    public List<T> getAllProducts(){
        return vendingMachine;
    };

    public void setVendingMachine(List<T> vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void addProduct(T product){
        vendingMachine.add(product);
    }

}
