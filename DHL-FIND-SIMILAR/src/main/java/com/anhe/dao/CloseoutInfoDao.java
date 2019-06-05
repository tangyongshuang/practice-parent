package com.anhe.dao;

import com.anhe.entity.CloseoutInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Albert.Tang on 2019/5/4 4:59 PM.
 */
public interface CloseoutInfoDao extends JpaRepository<CloseoutInfo, Integer> {
    List<CloseoutInfo> findByValueIsLike(String value);

    @Query(value = "select * from closeout_info c where c.value like ?1",nativeQuery = true)
    List<CloseoutInfo> findByValueLike(String value);
}
