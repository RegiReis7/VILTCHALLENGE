package com.VILTGROUP.VILTCHALLENGE.service;


import com.VILTGROUP.VILTCHALLENGE.entity.Collaborator;

import java.util.List;

public interface CollaboratorService {
    List<Collaborator> getCollaborators();

    Collaborator insertCollaborator(Collaborator c);

    Collaborator postponeById(Long idCollaborator);
}
