package com.choongang.erpproject.accounting.mapper;

import com.choongang.erpproject.accounting.dto.AccResponseDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccMapper {

    //전표 생성
    public int insertAccInfo(AccResponseDto params);

    //전표 조회
    public List<AccResponseDto> selectAccList();

    //전표 상세 조회(전표번호 id) / return 결의번호 리스트
    public List<AccResponseDto> selectAccDetail(Long stat_num);

    //결의번호 조회
    public int getExp_num(Long stat_num);

    int count();

}