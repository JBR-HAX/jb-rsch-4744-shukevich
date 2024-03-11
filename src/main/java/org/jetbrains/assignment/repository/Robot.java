package org.jetbrains.assignment.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Robot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(mappedBy = "robot", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Route route;


}
