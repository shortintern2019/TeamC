package com.vegas.spotapi.constant;

public enum CdType {
    RESTAURANT(1),
    SOLO_TRAVELLING(2);

    private int id;

    private CdType(int id){
        this.id = id;
    }
}
