package ru.gb.spring.my_timesheet.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

//    @ManyToMany
//    @JoinTable(
//            name = "user_role",
//            joinColumns = @JoinColumn(name ="users_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id")
//    )
//    private List<Role> roles;

    @ManyToMany(mappedBy = "users")
//    @JoinTable(name = "user_role",
//            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "users_id",
//                    referencedColumnName = "id"))
    private List<Role> roles;
}

