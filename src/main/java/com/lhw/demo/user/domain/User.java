package com.lhw.demo.user.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public LocalDateTime reg_date;
    public LocalDateTime update_date;
    public String email;
    public String password;
    public String name;
}
