package org.jetbrains.assignment.repository;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Getter
@Setter
@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "robot_id", nullable = false)
    private Long id;

    @Column
    private String direction;

    @Column
    private Integer distance;

    @OneToOne
    @MapsId
    @JoinColumn(name = "robot_id")
    private Robot robot;




}
