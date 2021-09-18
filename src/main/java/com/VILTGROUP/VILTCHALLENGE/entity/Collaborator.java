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

    private String firstName;
    private String lastName;
    private Double budget;
    @Column(columnDefinition = "integer default 0")
    private int postpone;
}
