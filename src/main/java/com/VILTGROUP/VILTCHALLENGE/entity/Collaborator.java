package com.VILTGROUP.VILTCHALLENGE.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Collaborator {
    @Id
    @SequenceGenerator(
            name = "collaborator_sequence",
            sequenceName = "sequence_collaborator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence_collaborator"
    )
    private Long idCollaborator;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(columnDefinition = "double default 0")
    private double budget;
    @Column(columnDefinition = "boolean default false")
    private boolean postpone;
}
