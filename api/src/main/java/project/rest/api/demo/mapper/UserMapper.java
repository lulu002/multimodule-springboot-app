package project.rest.api.demo.mapper;


import java.util.List;

import project.common.mapper.MyMapper;
import project.rest.api.demo.entity.User;

public interface UserMapper extends MyMapper<User> {

    List<User> selectAll();
}