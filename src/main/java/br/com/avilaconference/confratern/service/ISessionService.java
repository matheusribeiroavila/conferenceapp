package br.com.avilaconference.confratern.service;

import br.com.avilaconference.confratern.model.Session;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ISessionService {
    public Session addSession(Session session);
    public Session getSessionById(Integer id);
    public List<Session> getAllSessions();
}
