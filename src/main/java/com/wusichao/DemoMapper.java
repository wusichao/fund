package com.wusichao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper {
    @Insert("insert into fund (value) values (#{i})")
    void save(int i);
}
