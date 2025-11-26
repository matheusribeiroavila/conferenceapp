package br.com.avilaconference.confratern.controller;

import br.com.avilaconference.confratern.model.Conference;
import br.com.avilaconference.confratern.service.IConferenceSevice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConferenceController {

    private IConferenceSevice conferenceSevice;

    public ConferenceController(IConferenceSevice conferenceSevice) {
        this.conferenceSevice = conferenceSevice;
    }

    @PostMapping("/conference")
    public ResponseEntity<Conference> addNewConference(@RequestBody Conference conference){
        return ResponseEntity.status(201).body(conferenceSevice.addConference(conference));
    }

    @GetMapping("/conference/{conferenceId}")
    public ResponseEntity<Conference> getConferenceById(@PathVariable Integer conferenceId){
        return ResponseEntity.ok().body(conferenceSevice.getConferenceById(conferenceId));
    }

    @GetMapping("/conference")
    public ResponseEntity<List<Conference>> getAllConferences(){
        return ResponseEntity.ok().body(conferenceSevice.getAllConferences());
    }

}
