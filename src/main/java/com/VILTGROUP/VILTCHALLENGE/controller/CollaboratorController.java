package com.VILTGROUP.VILTCHALLENGE.controller;


import com.VILTGROUP.VILTCHALLENGE.service.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollaboratorController {

    @Autowired
    private CollaboratorService collaboratorService;
}
