package com.vegas.userapi.constant;

public enum BodyType {
    SLIM(1),
    NORMAL(2),
    CHUBBY(3),
    EXTRA_SIZE(4);

    private int id;

    private BodyType(int id){
        this.id = id;
    }
}
