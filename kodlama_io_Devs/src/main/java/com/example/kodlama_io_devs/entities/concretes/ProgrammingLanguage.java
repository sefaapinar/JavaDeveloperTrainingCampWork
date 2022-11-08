package com.example.kodlama_io_devs.entities.concretes;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "programming_languages")
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private int id;

    @Column(name = "name")
    private String name;

//    @OneToMany(mappedBy = "programmingLanguage" , fetch = FetchType.LAZY ,
//            targetEntity = SubTechnology.class , cascade = CascadeType.ALL)
//    private List<SubTechnology> subTechnologies;

    @OneToMany(mappedBy = "programmingLanguage" , fetch = FetchType.LAZY ,
            targetEntity = SubTechnology.class , cascade = CascadeType.ALL)
    private List<SubTechnology> subTechnologies;
}