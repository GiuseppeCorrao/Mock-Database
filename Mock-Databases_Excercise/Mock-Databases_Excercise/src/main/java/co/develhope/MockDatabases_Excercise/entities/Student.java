package co.develhope.MockDatabases_Excercise.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NonNull
    private String firstname;

    @NonNull
    private String lastname;

    @Column(unique = true)
    private String email;
}
