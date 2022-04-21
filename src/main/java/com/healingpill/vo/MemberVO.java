package com.healingpill.vo;

import lombok.Data;

import java.sql.Date;

// member 테이블 등록 데이터
@Data
public class MemberVO {
    private int mem_no;
    private String mem_id;
    private String mem_pwd;
    private String mem_birth_year;
    private int mem_birth_month;
    private int mem_birth_day;
    private int mem_sex;
    private String mem_email;
    private Date mem_register_datetime;
    private int mem_is_admin;
}
