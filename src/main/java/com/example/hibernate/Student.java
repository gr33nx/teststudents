package com.example.hibernate;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yatharthbisht on 11/04/17.
 */

@Entity
@Table(name = "Students")
public class Student {

    private Long id;
    private String name;
    private int roll_no;

    public Student(){

    }

    public Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;

    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    public Long getId() {return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {return roll_no;}

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }




}
