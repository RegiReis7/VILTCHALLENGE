package com.VILTGROUP.VILTCHALLENGE.controller;


import com.VILTGROUP.VILTCHALLENGE.entity.Collaborator;
import com.VILTGROUP.VILTCHALLENGE.service.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/collaborators/{id}")
    public Collaborator postponeById(@PathVariable("id") Long idCollaborator)
    {
        return collaboratorService.postponeById(idCollaborator);
    }
}
