package com.vegas.userapi.constant;

public enum BodyType {
    Slim(1),
    Normal(2),
    Chubby(3),
    ExtraSize(4);

    private int id;

    private BodyType(int id){
        this.id = id;
    }
}
