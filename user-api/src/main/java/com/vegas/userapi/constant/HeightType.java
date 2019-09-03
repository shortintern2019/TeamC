package com.vegas.userapi.constant;

public enum HeightType {
    VERY_SHORT(1),
    SHORT(2),
    NORMAL(3),
    TALL(4);

    private int id;

    private HeightType(int id){
        this.id = id;
    }
}
