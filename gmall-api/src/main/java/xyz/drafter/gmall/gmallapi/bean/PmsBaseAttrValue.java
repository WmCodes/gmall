package xyz.drafter.gmall.gmallapi.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author wangmeng
 * @date 2019/10/16
 * @desciption
 */
public class PmsBaseAttrValue implements Serializable {

    @Id
    @Column
    private Long id;
    @Column
    private String valueName;
    @Column
    private Long attrId;
    @Column
    private String isEnabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }
}
