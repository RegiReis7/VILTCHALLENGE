package com.VILTGROUP.VILTCHALLENGE.controller;


import com.VILTGROUP.VILTCHALLENGE.entity.Collaborator;
import com.VILTGROUP.VILTCHALLENGE.repository.CollaboratorRepository;
import com.VILTGROUP.VILTCHALLENGE.service.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollaboratorController {

    @Autowired
    private CollaboratorService collaboratorService;

    @GetMapping("/collaborators")
    public List<Collaborator> getCollaborators()
    {
        return collaboratorService.getCollaborators();
    }

    @PostMapping("/collaborators")
    public Collaborator insertCollaborator(@RequestBody Collaborator c)
    {
        return collaboratorService.insertCollaborator(c);
    }
}
