package com.veagas.spotsearchapi.constant;

public enum ActivityType {
    GOURMET(1),
    SOLO_TRAVELLING(2),
    SPORTS(3),
    AMUSEMENT(4),
    DRIVING(5),
    SHOPPING(6),
    DATE(7),
    GIRLS_ONLY_PARTY(8);

    private int id;

    private ActivityType(int id){
        this.id = id;
    }
}
