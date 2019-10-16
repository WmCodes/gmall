package xyz.drafter.gmall.gmallapi.service;

import xyz.drafter.gmall.gmallapi.bean.PmsBaseCatalog1;
import xyz.drafter.gmall.gmallapi.bean.PmsBaseCatelog2;
import xyz.drafter.gmall.gmallapi.bean.PmsBaseCatelog3;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/10/16
 * @desciption
 */
public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatelog2> getCatelog2(String catalog1Id);

    List<PmsBaseCatelog3> getCatelog3(String catalog2Id);
}
