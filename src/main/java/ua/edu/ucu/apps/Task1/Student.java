package ua.edu.ucu.apps.Task1;

import java.util.List;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter @SuperBuilder @ToString
public class Student extends Human{
    private String firstName;
    private String lastName;
    private int age;
    @Singular
    private List<String> grades;
    private String group;
    private int height;
    @Singular("mouse")
    private List<String> mice;

    
}
