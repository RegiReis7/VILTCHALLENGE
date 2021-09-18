package com.VILTGROUP.VILTCHALLENGE.service;

import com.VILTGROUP.VILTCHALLENGE.entity.Collaborator;
import com.VILTGROUP.VILTCHALLENGE.repository.CollaboratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class CollaboratorServiceImpl implements CollaboratorService {

    @Autowired
    private CollaboratorRepository collaboratorRepository;

    @Override
    public List<Collaborator> getCollaborators() {
        List<Collaborator> collaboratorList = collaboratorRepository.findAll();
        Collections.reverse(collaboratorList);
        return collaboratorList;
    }

    @Override
    public Collaborator insertCollaborator(Collaborator c) {
        return collaboratorRepository.save(c);
    }

    @Override
    public Collaborator postponeById(Long idCollaborator) {
        Collaborator c = collaboratorRepository.findById(idCollaborator).get();
        c.setPostpone(true);
        return collaboratorRepository.save(c);
    }

    @Override
    public Collaborator takePostponedTag(Long idCollaborator) {
        Collaborator c = collaboratorRepository.findById(idCollaborator).get();
        c.setPostpone(false);
        return collaboratorRepository.save(c);
    }
}
