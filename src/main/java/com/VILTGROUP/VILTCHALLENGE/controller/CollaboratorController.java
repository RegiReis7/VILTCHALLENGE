package com.VILTGROUP.VILTCHALLENGE.controller;


import com.VILTGROUP.VILTCHALLENGE.entity.Collaborator;
import com.VILTGROUP.VILTCHALLENGE.service.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500/")
@RestController
@RequestMapping("api/")
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

    @PutMapping("/collaborators/{id}")
    public Collaborator postponeById(@PathVariable("id") Long idCollaborator)
    {
        return collaboratorService.postponeById(idCollaborator);
    }

    @PutMapping("/collaborators/postpone/{id}")
    public Collaborator takePostponedTag(@PathVariable("id") Long idCollaborator)
    {
        return collaboratorService.takePostponedTag(idCollaborator);
    }
}
