package org.MachineCodingInterview.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Node {
    private String text;
    private Boolean isAQuestion;
    private Node yesNode;
    private Node noNode;
}
