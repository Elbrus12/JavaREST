package com.example.demo.Parse;
import com.fasterxml.jackson.annotation.JsonView;

public class Response {
    @JsonView
    private String value;
    login loginObject;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public login getloginObject() {
        return loginObject;
    }

    public void setloginObject(login loginObject) {
        loginObject = loginObject;
    }
}

