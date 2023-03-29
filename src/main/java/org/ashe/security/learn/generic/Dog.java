package org.ashe.security.learn.generic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog extends Animal {

    private String name;

    public Dog(Long id, String name, String hobby) {
        super(id, name, hobby);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
