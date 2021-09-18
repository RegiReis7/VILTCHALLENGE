package com.VILTGROUP.VILTCHALLENGE.service;

import com.VILTGROUP.VILTCHALLENGE.entity.Collaborator;
import com.VILTGROUP.VILTCHALLENGE.repository.CollaboratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollaboratorServiceImpl implements CollaboratorService {

    @Autowired
    private CollaboratorRepository collaboratorRepository;

    @Override
    public List<Collaborator> getCollaborators() {
        return collaboratorRepository.findAll();
    }
}
