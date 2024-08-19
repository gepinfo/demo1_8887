package com.geppetto.demo1.dao.daoimpl;

import com.geppetto.demo1.model.User;
import com.geppetto.demo1.repository.UserRepository;
import com.geppetto.demo1.dao.UserDao;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao{

    private final UserRepository userRepository;

     public UserDaoImpl(UserRepository userRepository) {
       this.userRepository = userRepository;
}





}
