package xyz.drafter.gmall.gmallmanagerweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.drafter.gmall.gmallapi.bean.PmsBaseAttrInfo;
import xyz.drafter.gmall.gmallapi.service.AttrService;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/10/16
 * @desciption 属性
 */
@Controller
@CrossOrigin
public class AttrController {

    @Reference
    AttrService attrService;


    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String attrInfoList(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){

        //保存attrInfo 对应的 attrValue
        return "success";
    }


    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){

        List<PmsBaseAttrInfo> pmsBaseAttrInfos = attrService.attrInfoList(catalog3Id);
        return pmsBaseAttrInfos;
    }
}
