package xyz.drafter.gmall.gmallapi.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author wangmeng
 * @date 2019/10/16
 * @desciption
 */
public class PmsBaseAttrInfo implements Serializable {

    @Id
    @Column
    private Long id;
    @Column
    private String attrName;
    @Column
    private Long catalog3Id;
    @Column
    private String idEnabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getIdEnabled() {
        return idEnabled;
    }

    public void setIdEnabled(String idEnabled) {
        this.idEnabled = idEnabled;
    }
}
