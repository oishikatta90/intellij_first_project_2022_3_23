package com.lhw.demo.user.domain;

import javax.persistence.Entity;
import java.time.LocalDateTime;

public class User {
    public long id;
    public LocalDateTime reg_date;
    public LocalDateTime update_date;
    public String email;
    public String password;
    public String name;
}
