package com.example;

import java.util.List;

public interface Predator {

    List<String> eatMeat() throws Exception;
    String getFamily();
    int getKittens();
    int getKittens(int kittensCount);

}
