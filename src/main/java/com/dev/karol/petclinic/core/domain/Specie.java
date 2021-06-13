package com.dev.karol.petclinic.core.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Specie {
    CAT("cat"),
    DOG("dog"),
    RABBIT("rabbit"),
    BIRD("bird");

    private String name;

    private Specie(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
