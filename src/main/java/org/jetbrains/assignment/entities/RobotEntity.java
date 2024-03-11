package org.jetbrains.assignment.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class RobotEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(mappedBy = "robotEntity", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private RouteEntity routeEntity;


}
