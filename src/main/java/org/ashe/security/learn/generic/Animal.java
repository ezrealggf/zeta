package org.ashe.security.learn.generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Animal {

    private Long id;
    private String name;
    private String hobby;

    @Override
    public String toString() {
        return String.format("%s like %s", name, hobby);
    }
}
