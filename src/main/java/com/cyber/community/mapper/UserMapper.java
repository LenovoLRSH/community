package com.cyber.community.mapper;

import com.cyber.community.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user (name,account_id,token,gmt_create,gmt_modified,avatar_url) VALUES (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
//    @Insert("INSERT INTO user (name) VALUE (#{name})")
    void insert(User user);

    @Select("SELECT * FROM USER WHERE token = #{token}")
    User findByToken(@Param("token")String token);

    @Select("SELECT * FROM USER WHERE id = #{id}")
    User findById(@Param("id")Integer id);

    @Select("SELECT * FROM USER WHERE account_id = #{accountId}")
    User findByAccountId(@Param("accountId")String accountId);

    @Update("UPDATE user SET name = #{name}, token = #{token}, gmt_modified = #{gmtModified}, avatar_url = #{avatarUrl} WHERE id = #{id}")
    void update(User dbUser);
}
