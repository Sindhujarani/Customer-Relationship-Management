package com.example.CMR_Project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = ("Employee"))
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    @Column(name = "Name", nullable = false)
    private String Name;
    @Column(name = "Email")
    private String email;
    @Column(name = "RoleName", nullable = false)
    private String roleName;
    @Column(name = "City", nullable = false)
    private String city;

    public Employee(){

    }
    public Employee(String name, String email, String roleName, String city) {
        super();
        Name = name;
        this.email = email;
        this.roleName = roleName;
        this.city = city;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
