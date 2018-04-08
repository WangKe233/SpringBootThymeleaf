package com.example.Entity;

import javax.persistence.*;

/*
 * Created by WK on 2018/4/2.
 * 角色表
*/


@Entity
@Table(name = "sys_role")
public class SysRole {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
