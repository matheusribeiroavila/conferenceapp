package br.com.avilaconference.confratern.service;

import br.com.avilaconference.confratern.model.Conference;

import java.util.List;

public interface IConferenceSevice {
    public Conference addConference(Conference conference);
    public Conference getConferenceById(Integer id);
    public List<Conference> getAllConferences();
}
