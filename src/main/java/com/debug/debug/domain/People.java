package com.debug.debug.domain;

import javax.persistence.*;

@Entity
@Table(name = "people",indexes = {@Index(name = "id",columnList = "id",unique = true)})
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="size",nullable = false)
    private String size;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public People(Integer id, String size, Integer age) {
        this.id = id;
        this.size = size;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }

    public People() {
    }
}
