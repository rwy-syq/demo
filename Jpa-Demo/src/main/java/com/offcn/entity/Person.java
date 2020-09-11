package com.offcn.entity;


import lombok.*;

import javax.persistence.*;

@Data
@Table(name="t_person")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Person {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name", nullable = true, length = 20)
    private String name;
    @Column(name = "age", nullable = true, length = 4)
    private int age;

}
