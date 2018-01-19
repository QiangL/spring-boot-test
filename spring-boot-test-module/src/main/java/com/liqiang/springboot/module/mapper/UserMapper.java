package com.liqiang.springboot.module.mapper;

import com.liqiang.springboot.module.domain.UserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liqiang
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
