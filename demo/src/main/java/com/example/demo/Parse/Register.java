package com.example.demo.Parse;
import com.fasterxml.jackson.annotation.JsonView;

public class Register {
    @JsonView
    private String RegisterID;
    Messages MessagesObject;

    public String getRegisterID() {
        return RegisterID;
    }

    public void setRegisterID(String RegisterID) {
        this.RegisterID = RegisterID;
    }

    public Messages getMessages() {
        return MessagesObject;
    }

    public void setMessages( Messages messagesObject ) {
        this.MessagesObject = messagesObject;
    }
}


