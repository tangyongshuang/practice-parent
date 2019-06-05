package com.anhe.dao;


import com.anhe.entity.UserInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserInfoDao extends JpaRepository<UserInfo,Long> {



}
