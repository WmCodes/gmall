package xyz.drafter.gmall.gmallapi.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author wangmeng
 * @date 2019/10/16
 * @desciption
 */
public class PmsBaseCatalog1  implements Serializable {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)//插入时候返回主键
    private Long id;

    @Column
    private String name;

    @Transient
    private List<PmsBaseCatelog2> catelog2s;


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


    public List<PmsBaseCatelog2> getCatelog2s() {
        return catelog2s;
    }

    public void setCatelog2s(List<PmsBaseCatelog2> catelog2s) {
        this.catelog2s = catelog2s;
    }
}
