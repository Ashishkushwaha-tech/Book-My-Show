package com.example.eazytech.BookMyShowApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="users")
public class User extends BaseModel{
    private String email;
}
