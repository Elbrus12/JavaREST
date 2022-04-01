package com.example.demo.Consol;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.demo.Parse.*;

@RestController

public class ParseConsoller {
    @RequestMapping(value = "/email", method = RequestMethod.POST)
    public ResponseEntity<Response> postlogin(@RequestBody Register Register){
        Response Response = new Response();
        Response.setValue(Register.getMessages().getEmail());
        login login = new login();
        login.setCode("Вы вошли в систему");
        Response.setloginObject(login);
        return new ResponseEntity<>(Response, HttpStatus.OK);
    }
}
