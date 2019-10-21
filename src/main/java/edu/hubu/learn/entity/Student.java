package edu.hubu.learn.entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    private String name;

    private String sex;

    private String classnum;

    @Column(name="avatar_url")
    private String avatar;
}