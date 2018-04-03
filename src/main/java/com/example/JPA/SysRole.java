package com.example.JPA;

import javax.persistence.*;

/**
 * Created by WK on 2018/4/2.
 * 角色表
 */

@Entity
@Table(name = "s_role")
public class SysRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 10)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid", nullable = false)
    private SysUser SUser; //角色对应的用户实体

    @Column(name = "name", length = 100)
    private String name; //角色名称

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SysUser getSUser() {
        return SUser;
    }

    public void setSUser(SysUser SUser) {
        this.SUser = SUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
