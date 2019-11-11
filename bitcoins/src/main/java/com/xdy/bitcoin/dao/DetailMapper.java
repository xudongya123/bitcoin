package com.xdy.bitcoin.dao;

import com.xdy.bitcoin.po.Detail;

public interface DetailMapper {
    int deleteByPrimaryKey(String detailid);

    int insert(Detail record);

    int insertSelective(Detail record);

    Detail selectByPrimaryKey(String detailid);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);
}