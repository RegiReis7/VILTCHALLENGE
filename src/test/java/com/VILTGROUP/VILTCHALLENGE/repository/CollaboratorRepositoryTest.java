package com.VILTGROUP.VILTCHALLENGE.repository;

import com.VILTGROUP.VILTCHALLENGE.entity.Collaborator;
import com.VILTGROUP.VILTCHALLENGE.service.CollaboratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CollaboratorRepositoryTest {

    @Autowired
    private CollaboratorRepository collaboratorRepository;

    @Test
    public void insertCollaborator(){
        Collaborator c = Collaborator.builder()
                .firstName("Reginaldo")
                .lastName("Reis")
                .budget(250D)
                .build();

        collaboratorRepository.save(c);
    }

    @Test
    public void getCollaborators(){
        collaboratorRepository.findAll();
    }
}