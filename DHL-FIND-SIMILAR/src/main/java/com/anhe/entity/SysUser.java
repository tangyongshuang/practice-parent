package com.anhe.entity;

import javax.persistence.*;

/**
 * Created by Albert.Tang on 2019/5/4 6:50 PM.
 */
@Entity
@Table(name = "sys_user")
public class SysUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer useNo;

//    @Column(name = "use_name")
    private String useName;

    private String useId;

    private String useMail;

    public SysUser() {
    }

    public Integer getUseNo() {
        return useNo;
    }

    public void setUseNo(Integer useNo) {
        this.useNo = useNo;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getUseMail() {
        return useMail;
    }

    public void setUseMail(String useMail) {
        this.useMail = useMail;
    }

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId;
    }
}
