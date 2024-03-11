package org.jetbrains.assignment.repository;

import org.jetbrains.assignment.entities.RobotEntity;
import org.springframework.data.repository.CrudRepository;

public interface RobotRepository extends CrudRepository<RobotEntity, Long> {
}
