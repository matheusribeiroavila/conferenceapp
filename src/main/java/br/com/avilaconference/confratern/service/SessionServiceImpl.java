package br.com.avilaconference.confratern.service;

import br.com.avilaconference.confratern.exception.NotFoundException;
import br.com.avilaconference.confratern.model.Session;
import br.com.avilaconference.confratern.repository.SessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements  ISessionService{

    private SessionRepository sessionRepository;

    public SessionServiceImpl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public Session addSession(Session session) {
        return sessionRepository.save(session);
    }

    @Override
    public Session getSessionById(Integer id) {
        return sessionRepository.findById(id).orElseThrow(() -> new NotFoundException("Session ["+id+"] not found."));
    }

    @Override
    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }
}
