package br.com.avilaconference.confratern.controller;

import br.com.avilaconference.confratern.model.Session;
import br.com.avilaconference.confratern.service.ISessionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SessionController {

   private ISessionService sessionService;

   public SessionController(ISessionService sessionService){
       this.sessionService = sessionService;
   }

    @PostMapping("/session")
    public ResponseEntity<Session> addNewSession(@RequestBody Session session){
        return ResponseEntity.status(201).body(sessionService.addSession(session));
    }

    @GetMapping("/session")
    public ResponseEntity<List<Session>> getAllSession(){
        return ResponseEntity.ok().body(sessionService.getAllSessions());
    }

    @GetMapping("/session/{id}")
    public ResponseEntity<Session> getSessionById(@PathVariable Integer id){
        return ResponseEntity.ok().body(sessionService.getSessionById(id));
    }

}
