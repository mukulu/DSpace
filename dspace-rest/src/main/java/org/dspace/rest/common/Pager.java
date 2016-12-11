package main.java.org.dspace.rest.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by root on 12/9/16.
 */
@XmlRootElement
public class Pager implements Serializable {
    @XmlElement
    private Integer pageSize;
    @XmlElement
    private Integer total;
    @XmlElement
    private Integer page;
    public Pager(){

    }
    public Pager(int page,int pageSize,int total){
        this.pageSize = pageSize;
        this.total = total;
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getPage() {
        return page;
    }
}
