package org.example.entities;

import lombok.Data;

import java.util.Date;
import java.util.UUID;
@Data
public class User {
    @Override
    public String toString() {
        return super.toString();
    }
    private Group group;
    public String name;
    public String email;
    public String password;
    public Date createdAt;
    public Date updatedAt;
    public int age;
    public UUID Id;
}
