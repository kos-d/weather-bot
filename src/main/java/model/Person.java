package model;

import lombok.Data;
//import lombok.Getter;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String lastName;
    private int age;
    
//    public Person() {}
    
//    public Person(String name, String lastName, int age) {
//        this.name = name;
//        this.lastName = lastName;
//        this.age = age;
//    }
}
