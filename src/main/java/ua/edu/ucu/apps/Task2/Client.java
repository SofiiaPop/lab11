package ua.edu.ucu.apps.Task2;

import java.time.LocalDate;
import java.time.Period;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString @Getter @NoArgsConstructor
public class Client {
    private static int counter;
    private int id = counter++;
    private String name;
    private LocalDate deb;
    private String gender;
    public Client(String name, LocalDate deb, String gender) {
        this.name = name;
        this.deb = deb;
        this.gender = gender;
    }

    public int getAge() {
        if (deb == null) {
            return 0;
        }
        return Period.between(deb, LocalDate.now()).getYears();
    }
}
