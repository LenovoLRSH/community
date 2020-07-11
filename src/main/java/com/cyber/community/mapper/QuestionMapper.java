package com.cyber.community.mapper;

import com.cyber.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {

    @Insert("INSERT INTO question(title,description,gmt_create,gmt_modified,creator,tag) VALUES(#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void create(Question question);


    @Select("SELECT * FROM question limit #{offset}, #{size}")
    List<Question> list(@Param(value = "offset") Integer offset,
                        @Param(value = "size") Integer size);

    @Select("SELECT COUNT(1) FROM question")
    Integer count();

    @Select("SELECT * FROM question WHERE creator = #{userId} limit #{offset}, #{size}")
    List<Question> listByUserId(@Param(value = "userId") Integer userId,
                        @Param(value = "offset") Integer offset,
                        @Param(value = "size") Integer size);

    @Select("SELECT COUNT(1) FROM question where creator = #{userId}")
    Integer countByUserId(@Param(value = "userId") Integer userId);

    @Select("SELECT * FROM question WHERE id = #{id}")
    Question getById(@Param(value = "id") Integer id);
}
