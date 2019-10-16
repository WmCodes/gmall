package xyz.drafter.gmall.gmallmanagerweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.drafter.gmall.gmallapi.bean.PmsBaseCatalog1;
import xyz.drafter.gmall.gmallapi.bean.PmsBaseCatelog2;
import xyz.drafter.gmall.gmallapi.bean.PmsBaseCatelog3;
import xyz.drafter.gmall.gmallapi.service.CatalogService;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/10/16
 * @desciption
 */

@Controller
// 跨域注解
@CrossOrigin
public class CatalogController {

    @Reference
    CatalogService catalogService;


    @RequestMapping("getCatelog3")
    @ResponseBody
    public List<PmsBaseCatelog3> getCatelog3(String catalog2Id){

        List<PmsBaseCatelog3> catalog3s = catalogService.getCatelog3(catalog2Id);
        return catalog3s;
    }

    @RequestMapping("getCatelog2")
    @ResponseBody
    public List<PmsBaseCatelog2> getCatelog2( String catalog1Id){

        List<PmsBaseCatelog2> catalog2s = catalogService.getCatelog2(catalog1Id);
        return catalog2s;
    }

    @RequestMapping("getCatelog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){

        List<PmsBaseCatalog1> catalog1s = catalogService.getCatalog1();
        return catalog1s;
    }
}
