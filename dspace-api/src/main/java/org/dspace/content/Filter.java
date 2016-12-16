package org.dspace.content;

import org.dspace.content.FilterParameter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/**
 * Created by Vincent Minde on 12/13/16.
 */
public class Filter {
    private List<String> filters;
    private List<FilterParameter> filterParameters;
    public Filter(List<String> filters){
        this.filters = filters;
        filterParameters = new ArrayList<FilterParameter>();
        Iterator itr = filters.iterator();
        int i = 1;
        while(itr.hasNext()) {
            String filter = (String) itr.next();
            String[] parts = filter.split(":");
            System.out.print("Part[1]:" + (parts[1]));
            if(parts[1].equals("eq")){
                filterParameters.add(new FilterParameter(parts[0],parts[1],parts[0] + i,parts[0] + " = :" + parts[0]));
            }
            i++;
        }
    }

    public List<FilterParameter> getFilterParameters(){
        return filterParameters;
    }
}
