package com.dotin.dtntask.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class User {
//    @Column(name = "username")

    @NotNull(message = "Please fill this field")
    @NotEmpty(message = "Please fill this field")
    private String name;
    private String family;
    @Id
    private String email;
    private String phone;
    private String password;
}
