package br.com.avilaconference.confratern.service;

import br.com.avilaconference.confratern.exception.NotFoundException;
import br.com.avilaconference.confratern.model.Conference;
import br.com.avilaconference.confratern.repository.ConferenceRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceServiceImpl implements IConferenceSevice{

    private ConferenceRepository conferenceRepository;

    public ConferenceServiceImpl(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }

    @Override
    public Conference addConference(Conference conference) {
        return conferenceRepository.save(conference);
    }

    @Override
    public Conference getConferenceById(Integer id) {
        return conferenceRepository.findById(id).orElseThrow(() -> new NotFoundException("Conference [ "+id+" ] not found"));
    }

    @Override
    public List<Conference> getAllConferences() {
        return conferenceRepository.findAll();
    }
}
