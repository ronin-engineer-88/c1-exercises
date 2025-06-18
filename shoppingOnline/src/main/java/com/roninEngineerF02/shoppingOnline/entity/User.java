package com.roninEngineerF02.shoppingOnline.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity<Long> {

    private String email;

    private String password;

    private String fullname;

    private String status;

    private String role;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}