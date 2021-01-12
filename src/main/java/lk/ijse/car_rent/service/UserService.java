package lk.ijse.car_rent.service;

import lk.ijse.car_rent.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO dto);

    void updateUser(UserDTO dto);

    UserDTO searchUser(String id);


    void deleteUser(String id);

    List<UserDTO> getAllUsers();
}
