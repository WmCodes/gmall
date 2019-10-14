package xyz.drafter.gmall.gmalluser.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.drafter.gmall.gmallapi.bean.UmsMember;
import xyz.drafter.gmall.gmallapi.bean.UmsMemberReceiveAddress;
import xyz.drafter.gmall.gmallapi.service.UserService;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/10/12
 * @desciption
 */
@Controller
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("getReceiveAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.umsMemberReceiveAddresses(memberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
