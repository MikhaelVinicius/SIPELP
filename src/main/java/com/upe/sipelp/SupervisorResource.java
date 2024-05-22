package com.upe.sipelp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.upe.sipelp.Entidades.Supervisor;

@RestController
@RequestMapping
public class SupervisorResource {

    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    public ResponseEntity<Supervisor> findAll(){
        Supervisor x = new Supervisor(1,"Mikhael Soel","14109208440","mikhaelvini@gmail.com","123456789","987654321","87991363356");
        return ResponseEntity.ok().body(x);
    }
    
}
