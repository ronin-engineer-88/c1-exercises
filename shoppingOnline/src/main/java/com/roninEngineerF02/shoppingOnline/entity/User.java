package com.roninEngineerF02.shoppingOnline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity<Long>{

    private String email;

    private String password;

    private String fullname;

    private String status;

    private String role;

}
