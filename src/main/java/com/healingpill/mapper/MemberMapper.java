package com.healingpill.mapper;

import com.healingpill.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

// 유저 정보를 DB에 저장하기 위한 Mapper 인터페이스
@Mapper
public interface MemberMapper {
    void saveMember(MemberVO memberVO);
}
