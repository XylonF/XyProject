package com.example.xyproject.Service.impl;

import com.example.xyproject.Service.UserService;
import com.example.xyproject.dao.UserDao;
import com.example.xyproject.pojo.User;
import com.example.xyproject.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    SqlSession sqlSession;
    @Override
    public User getUserById(int id) {
        sqlSession = MybatisUtils.getSqlSession();
        //方式一：getMapper
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUserById(id);

        sqlSession.close();

        return user;
    }
}
