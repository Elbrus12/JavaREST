package com.example.demo.Parse;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Messages {
    @JsonView
    private String id;
    @JsonView
    private String Email;
}
