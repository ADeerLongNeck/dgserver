package cn.adeerlongneck.dgserver.service.Impl;

import cn.adeerlongneck.dgserver.dao.UserMapper;
import cn.adeerlongneck.dgserver.entity.User;
import cn.adeerlongneck.dgserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(User record) {
        int flag = userMapper.insert(record);
        return flag;
    }

    @Override
    public int insertSelective(User record) {
        int flag = userMapper.insertSelective(record);
        return flag;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        int flag = userMapper.updateByPrimaryKeySelective(record);
        return flag;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        int flag = userMapper.updateByPrimaryKey(record);
        return flag;
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
