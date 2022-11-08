package com.example.kodlama_io_devs.entities.concretes;


import lombok.*;

import javax.persistence.*;

@Table(name = "sub_technologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class SubTechnology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

//    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
//            CascadeType.REFRESH}, fetch = FetchType.EAGER, targetEntity = ProgrammingLanguage.class)
//    @JoinColumn(name = "language_id")
//    private ProgrammingLanguage programmingLanguage;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH}, fetch = FetchType.EAGER, targetEntity = ProgrammingLanguage.class)
    @JoinColumn(name = "language_id")
    private ProgrammingLanguage programmingLanguage;
}
