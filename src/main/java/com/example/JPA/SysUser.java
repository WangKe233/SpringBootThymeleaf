package com.example.JPA;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by WK on 2018/4/2.
 */

@Entity
@Table(name = "s_user")
public class SysUser  implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true,nullable = false)
    private Integer id;

    @Column(name = "name", length = 120)
    private String name;  //用户名

    @Column(name = "email", length = 50)
    private String email; //用户邮箱

    @Column(name = "password", length = 120)
    private String password; //用户密码

    @Temporal(TemporalType.DATE)
    @Column(name = "dob", length = 10)
    private Date dob;   //时间

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "Suser")
    private Set<SysRole> SysRoles = new HashSet<SysRole>(0); //对应的角色集合

    public SysUser(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Set<SysRole> getSysRoles() {
        return SysRoles;
    }

    public void setSysRoles(Set<SysRole> sysRoles) {
        SysRoles = sysRoles;
    }

    public SysUser(String name, String email, String password, Date dob, Set<SysRole> SysRoles) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.SysRoles = SysRoles;
    }

}
