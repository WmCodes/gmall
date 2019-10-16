package xyz.drafter.gmall.gmallapi.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author wangmeng
 * @date 2019/10/16
 * @desciption
 */
public class PmsBaseCatelog3 implements Serializable {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)//插入时候返回主键
    private Long id;

    @Column
    private String name;


    @Column
    private Long catalog2Id;


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

    public Long getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(Long catalog2Id) {
        this.catalog2Id = catalog2Id;
    }
}
