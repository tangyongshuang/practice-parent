package com.anhe.dao;

import com.anhe.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Albert.Tang on 2019/5/4 10:03 PM.
 */
public interface SysUserDao extends JpaRepository<SysUser, Integer> {

    List<SysUser> findByUseIdIn(List<String> useIds);
}
