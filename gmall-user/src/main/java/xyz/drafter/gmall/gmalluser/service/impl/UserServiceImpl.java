package xyz.drafter.gmall.gmalluser.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.drafter.gmall.gmallapi.bean.UmsMember;
import xyz.drafter.gmall.gmallapi.bean.UmsMemberReceiveAddress;
import xyz.drafter.gmall.gmallapi.service.UserService;
import xyz.drafter.gmall.gmalluser.mapper.UmsMemberReceiveAddressMapper;
import xyz.drafter.gmall.gmalluser.mapper.UserMapper;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/10/12
 * @desciption
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList =  userMapper.selectAll();//userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> umsMemberReceiveAddresses(String memberId) {

    /*    Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId", memberId);*/
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(Long.parseLong(memberId));
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}
