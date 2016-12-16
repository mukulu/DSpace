package org.dspace.content;

/**
 * Created by root on 12/15/16.
 */
public class FilterParameter {

    private String name;
    private String value;
    private String sqlComparator;
    private String paramName;

    public FilterParameter(String name, String value,String paramName,String sqlComparator){
        this.name = name;
        this.value = value;
        this.sqlComparator = sqlComparator;
        this.paramName = paramName;
    }
    public String getName(){
        return this.name;
    }
    public String getValue(){
        return this.value;
    }
    public String getSqlComparator(){
        return this.sqlComparator;
    }
    public String getParamName(){
        return this.paramName;
    }
}
