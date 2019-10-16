package xyz.drafter.gmall.gmallmanageservice.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.drafter.gmall.gmallapi.bean.PmsBaseCatalog1;
import xyz.drafter.gmall.gmallapi.bean.PmsBaseCatelog2;
import xyz.drafter.gmall.gmallapi.bean.PmsBaseCatelog3;
import xyz.drafter.gmall.gmallapi.service.CatalogService;
import xyz.drafter.gmall.gmallmanageservice.mapper.PmsBaseCatalog1Mapper;
import xyz.drafter.gmall.gmallmanageservice.mapper.PmsBaseCatalog2Mapper;
import xyz.drafter.gmall.gmallmanageservice.mapper.PmsBaseCatalog3Mapper;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/10/16
 * @desciption
 */
@Service
public class CatalogServiceImpl implements CatalogService {



    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;


    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatelog2> getCatelog2(String catalog1Id) {

        PmsBaseCatelog2 pmsBaseCatelog2 = new PmsBaseCatelog2();
        pmsBaseCatelog2.setCatalog1Id(Long.parseLong(catalog1Id));
        List<PmsBaseCatelog2> catelog2s = pmsBaseCatalog2Mapper.select(pmsBaseCatelog2);
        return catelog2s;
    }

    @Override
    public List<PmsBaseCatelog3> getCatelog3(String catalog2Id) {

        PmsBaseCatelog3 pmsBaseCatelog3 = new PmsBaseCatelog3();
        pmsBaseCatelog3.setCatalog2Id(Long.parseLong(catalog2Id));
        List<PmsBaseCatelog3> catelog3s = pmsBaseCatalog3Mapper.select(pmsBaseCatelog3);
        return catelog3s;
    }


}
