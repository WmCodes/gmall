package xyz.drafter.gmall.gmallapi.service;

import xyz.drafter.gmall.gmallapi.bean.UmsMember;
import xyz.drafter.gmall.gmallapi.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/10/12
 * @desciption
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> umsMemberReceiveAddresses(String memberId);
}
