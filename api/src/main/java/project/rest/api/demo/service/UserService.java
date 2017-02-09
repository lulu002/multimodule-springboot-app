package project.rest.api.demo.service;

import org.springframework.stereotype.Service;

import project.common.model.DataResult;
import project.common.service.IService;
import project.rest.api.demo.domain.UserData;
import project.rest.api.demo.entity.User;

import java.util.List;

@Service
public interface UserService extends IService<User> {

    DataResult<List<UserData>> getAllUser();

    DataResult<UserData> get(int userId);

    DataResult<UserData> addUser(UserData user);

    DataResult<List<UserData>> addUsers(List<UserData> users);

    DataResult<UserData> updateUser(UserData user);

    DataResult<Integer> deleteUser(int userId);

}
