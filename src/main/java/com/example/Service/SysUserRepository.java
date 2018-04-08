package com.example.Service;

import com.example.Entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by WK on 2018/4/4.
 */
public interface SysUserRepository  extends JpaRepository<SysUser,Long>{
    SysUser findByUsername(String username);
}
