package xyz.drafter.gmall.gmallapi.service;

import xyz.drafter.gmall.gmallapi.bean.PmsBaseAttrInfo;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/10/16
 * @desciption
 */
public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
}
