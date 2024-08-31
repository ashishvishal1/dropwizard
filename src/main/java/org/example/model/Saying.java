package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Saying {
    private long id;
    private String content;

    public Saying() {
        // Jackson Deserialization
    }
    public Saying(long id, String content) {
        this.id=id;
        this.content=content;
    }
    @JsonProperty
    public long getId() {
        return id;
    }
    @JsonProperty String getContent() {
        return content;
    }

}
