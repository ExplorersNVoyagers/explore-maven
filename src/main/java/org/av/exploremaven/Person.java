package org.av.exploremaven;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
//    public Person() {
//
//    }

    private String firstName;
    private String lastName;

    public String getFullName(String firstName, String lastName) {

        if (firstName == null || firstName.isEmpty() || firstName.isBlank())
            throw new IllegalArgumentException("First Name is empty or invalid");

        if (lastName == null || lastName.isBlank())
            throw new IllegalArgumentException("Last Name is empty or invalid");

        return firstName + " " + lastName;
    }
}
