package xyz.drafter.gmall.gmallapi.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author wangmeng
 * @date 2019/10/16
 * @desciption
 */
public class PmsBaseCatelog2 implements Serializable {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)//插入时候返回主键
    private Long id;

    @Column
    private String name;


    @Column
    private Long catalog1Id;

    @Transient
    private List<PmsBaseCatelog3> catelog3s;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(Long catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    public List<PmsBaseCatelog3> getCatelog3s() {
        return catelog3s;
    }

    public void setCatelog3s(List<PmsBaseCatelog3> catelog3s) {
        this.catelog3s = catelog3s;
    }
}
