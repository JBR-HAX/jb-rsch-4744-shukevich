package org.jetbrains.assignment.repository;

import org.jetbrains.assignment.entities.Robot;
import org.springframework.data.repository.CrudRepository;

public interface RobotRepository extends CrudRepository<Robot, Long> {
}
