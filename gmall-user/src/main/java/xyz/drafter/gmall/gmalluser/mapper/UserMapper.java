package xyz.drafter.gmall.gmalluser.mapper;

import tk.mybatis.mapper.common.Mapper;
import xyz.drafter.gmall.gmallapi.bean.UmsMember;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/10/12
 * @desciption
 */
public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
