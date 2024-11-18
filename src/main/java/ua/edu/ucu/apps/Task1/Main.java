package ua.edu.ucu.apps.Task1;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Student student = Student.builder()
            .firstName("John")
            .lastName("Doe")
            .age(20)
            .grades(List.of("A", "B", "A"))
            .grade("100")
            .group("Physics")
            .height(180)
            .build();
            System.out.println(student.getFirstName());
    }
    
}