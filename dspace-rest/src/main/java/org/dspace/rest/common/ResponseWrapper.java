package main.java.org.dspace.rest.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by root on 12/9/16.
 */
@XmlRootElement
public class ResponseWrapper implements Serializable {
    @XmlElement
    private Pager pager;
    @XmlElement
    private Object[] results;

    private boolean paging;
    public ResponseWrapper(){

    }
    public ResponseWrapper(int page,int pageSize,int total,boolean paging){
        this.paging = paging;
        this.pager = new Pager(page,pageSize,total);
    }

    public void addObjects(Object[] results){
        //this.results = Arrays.copyOfRange(results, (this.pager.getPage() - 1) * this.pager.getPageSize(), ((this.pager.getPage() - 1) * this.pager.getPageSize()) + this.pager.getPageSize());
        int startIndex = (this.pager.getPage() - 1) * this.pager.getPageSize();
        int endIndex = ((this.pager.getPage() - 1) * this.pager.getPageSize()) + this.pager.getPageSize();
        try{
            if(startIndex > results.length){
                this.results = results;
            }else if(endIndex > results.length - 1){
                this.results = Arrays.copyOfRange(results, startIndex,results.length - 1);
            }else{
                this.results = Arrays.copyOfRange(results,startIndex, endIndex);
            }
        }catch(Exception e){
            System.out.println("Error:"+results.length +":" + startIndex + ":" + endIndex);
        }
    }
}
