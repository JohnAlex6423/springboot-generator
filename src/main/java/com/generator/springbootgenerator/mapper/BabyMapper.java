package com.generator.springbootgenerator.mapper;

import com.generator.springbootgenerator.model.Baby;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lqs
 */
@Mapper
public interface BabyMapper {

    /**
     * 查询所有的baby
     * @return
     */
    @Select("select * from baby")
    public List<Baby> getBaby();

    /**
     * 插入baby
     * @param baby
     * @return
     */
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into baby (name, sex, birthday) values (#{name}, #{sex}, #{birthday})")
    public int insertBaby(Baby baby);
}
