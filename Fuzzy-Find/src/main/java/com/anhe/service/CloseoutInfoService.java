package com.anhe.service;

import com.anhe.entity.CloseoutInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Albert.Tang on 2019/4/11 10:21 AM.
 */
public interface CloseoutInfoService {

    /**
     * 批量模糊查询
     * @return
     */
    List<CloseoutInfo> fuzzyQuery(String content);
}
