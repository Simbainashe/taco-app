package com.zamacloud.tacoapp;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author Fact S Musingarimi
 * 5/13/19
 * 10:10 AM
 */

@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;
    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
