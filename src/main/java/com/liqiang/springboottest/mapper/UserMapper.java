package com.liqiang.springboottest.mapper;

import com.liqiang.springboottest.domain.UserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liqiang (liqiang8@xiaomi.com)
 * @Date 2018/1/8
 **/
@Repository
public interface UserMapper {

    UserDO getUser(Integer id);

    int deleteUser(Integer id);

    List<UserDO> listUser(@Param("ids") List<Integer> ids);

    int updateUser(UserDO userDO);

    int insertUser(UserDO userDO);
}
