package com.generator.springbootgenerator.mapper;

import com.generator.springbootgenerator.model.Baby;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author lqs
 */
@Mapper
public interface BabyMapper {

    /**
     * 查询所有的baby
     *
     * @return
     */
    @Select("select * from baby")
    List<Baby> getBaby();

    /**
     * 根据id查询baby
     *
     * @param id
     * @return
     */
    @Select("select * from baby where id = #{id}")
    Baby getBabyById(@Param("id") Long id);

    /**
     * 插入baby
     *
     * @param baby
     * @return
     */
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into baby (name, sex, birthday) values (#{name}, #{sex}, #{birthday})")
    int insertBaby(Baby baby);
}
