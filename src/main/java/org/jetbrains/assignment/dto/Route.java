package org.jetbrains.assignment.dto;

import lombok.Data;

import java.util.List;

@Data
public class Route {
    private List<Step> steps;
}
