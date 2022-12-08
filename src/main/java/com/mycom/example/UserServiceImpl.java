package com.mycom.example;

import com.mycom.bean.UserVO;
import com.mycom.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    UserDAO userDAO;

    public UserVO getUser(UserVO vo) {
        return userDAO.getUser(vo);
    }
}
