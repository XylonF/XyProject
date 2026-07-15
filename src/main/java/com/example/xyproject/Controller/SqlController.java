package com.example.xyproject.Controller;

import com.example.xyproject.Service.UserService;
import com.example.xyproject.Service.impl.UserServiceImpl;
import com.example.xyproject.dao.UserDao;
import com.example.xyproject.pojo.User;
import com.example.xyproject.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class SqlController {

    UserService userService = new UserServiceImpl();

    SqlSession sqlSession;
    //写一个list请求，查询数据库信息
    @GetMapping("/list")
    public List<User> list(){

/*        String sql="select * from user";
        List<Map<String,Object>> list_map=jdbcTemplate.queryForList(sql);*/
        sqlSession = MybatisUtils.getSqlSession();
        //方式一：getMapper
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();

        sqlSession.close();
        return userList;

    }
    @GetMapping("/searchUser/{id}")
    public User SearchUserById(@PathVariable int id){
        return userService.getUserById(id);

    }
}
