//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	int total = 0;
    	List<Integer> listreturn = new ArrayList<Integer>();
    	for(int i = 0; i < m.length; i ++) {
    		for (int j = 0; j < m[i].length; j ++) {
    			total += m[i][j];
    		}
    		listreturn.add(total);
    		total = 0;
    	}
		return listreturn;
    }
}
