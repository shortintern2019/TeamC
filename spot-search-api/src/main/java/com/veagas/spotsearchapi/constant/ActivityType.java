package com.veagas.spotsearchapi.constant;

import lombok.Getter;

import java.util.Arrays;

public enum ActivityType {
    RESTAURANT(1,"レストラン"),
    SOLO_TRAVELLING(2, "一人旅"),
    SPORTS(3, "スポーツ"),
    AMUSEMENT(4, "アミューズメント"),
    DRIVING(5, "ドライブ"),
    SHOPPING(6, "ショッピング"),
    DATE(7, "デート"),
    GIRLS_PARTY(8, "女子会");

    @Getter
    private Integer id;
    @Getter
    private String name;

    private ActivityType(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getNameById(ActivityType type){
        return type.getName();
    }

    public static ActivityType getById(String id) {
        return Arrays.stream(ActivityType.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
