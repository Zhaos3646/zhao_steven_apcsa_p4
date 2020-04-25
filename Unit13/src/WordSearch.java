//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[(str.length()/size)][size];
    	int row = 0;
    	int count = 0;
    	while (count < (str.length()/size)*size) {
    		for (int i = 0; i < size; i ++) {
    			m[row][i] = str.substring(count, count + 1);
    			count ++;
    		}
    		row ++;
    	}
    }
    
    public boolean isFound( String word )
    {
    	for (int i = 0; i < (m[0].length - word.length()); i ++) {
    		for (int j = 0; j < m.length; j ++) {
    			if (checkRight(word, j, i)) {
    				return true;
    			}
    		}
    	}
    	for (int i = 0; i < (m[0].length - word.length()); i ++) {
    		for (int j = 0; j < m.length; j ++) {
    			if (checkLeft(word, j, i)) {
    				return true;
    			}
    		}
    	}
    	for (int i = 0; i < (m.length - word.length()); i ++) {
    		for (int j = 0; j < m.length; j ++) {
    			if (checkDown(word, i, j)) {
    				return true;
    			}
    		}
    	}
    	for (int i = 0; i < (m.length - word.length()); i ++) {
    		for (int j = 0; j < m.length; j ++) {
    			if (checkDown(word, i, j)) {
    				return true;
    			}
    		}
    	}
    	for (int i = 0; i < (m.length - word.length()); i ++) {
    		for (int j = 0; j < m.length - word.length(); j ++) {
    			if (checkDiagUpLeft(word, i, j)) {
    				return true;
    			}
    		}
    	}
    	for (int i = 0; i < (m.length - word.length()); i ++) {
    		for (int j = 0; j < m.length - word.length(); j ++) {
    			if (checkDiagUpRight(word, i, j)) {
    				return true;
    			}
    		}
    	}
    	for (int i = 0; i < (m.length - word.length()); i ++) {
    		for (int j = 0; j < m.length - word.length(); j ++) {
    			if (checkDiagDownLeft(word, i, j)) {
    				return true;
    			}
    		}
    	}
    	for (int i = 0; i < (m.length - word.length()); i ++) {
    		for (int j = 0; j < m.length - word.length(); j ++) {
    			if (checkDiagDownRight(word, i, j)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		for (int i = c; i < c + w.length(); i ++) {
			if (!(w.substring(i - c, (i-c+1)).equals(m[r][i]))) {
				return false;
			}
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		for (int i = c + w.length() - 1; i > c; i --) {
			if (!(w.substring(i-(c+w.length())+1, (i-(c+w.length()-1) + 2)).equals(m[r][i]))) {
				return false;
			}
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{

		for (int i = r + w.length() - 1; i > r; i --) {
			if (!(w.substring(i-(r+w.length()-1)+1, (i-(r+w.length() -1) + 2)).equals(m[i][c]))) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		for (int i = r; i < r + w.length(); i ++) {
			if (!(w.substring(i - r, (i-r+1)).equals(m[i][c]))) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int count = r + w.length() - 1;
		for (int i = c; i < c + w.length(); i ++) {
			if (!(w.substring(i - c, (i-c+1)).equals(m[count][i]))) {
				return false;
			}
			count--;
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		for (int i = c + w.length() - 1; i > c; i --) {
			if (!(w.substring(i-(c+w.length())+1, (i-(c+w.length()-1) + 2)).equals(m[i][i]))) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		int count = r + w.length() - 1;
		for (int i = r; i < r + w.length(); i ++) {
			if (!(w.substring(i - r, (i-r+1)).equals(m[i][count]))) {
				return false;
			}
			count --;
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		for (int i = c; i < c + w.length(); i ++) {
			if (!(w.substring(i - c, (i-c+1)).equals(m[i][i]))) {
				return false;
			}
		}
		return true;
	}

    public String toString()
    {
 		return "";
    }
}
