package xyz.drafter.gmall.gmallmanageservice.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.drafter.gmall.gmallapi.bean.PmsBaseAttrInfo;
import xyz.drafter.gmall.gmallapi.service.AttrService;
import xyz.drafter.gmall.gmallmanageservice.mapper.PmsBaseAttrInfoMapper;
import xyz.drafter.gmall.gmallmanageservice.mapper.PmsBaseAttrValueMapper;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/10/16
 * @desciption
 */

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(Long.parseLong(catalog3Id));
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);

        return pmsBaseAttrInfos;
    }
}
