package cisc181.lab_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;


public class CollectionProblems {

    /**
     * Returns a new List that contains all of the Integers in the
     * given List that are less than zero
     */
    public static List<Integer> lessThanZero(List<Integer> l) {

    	List<Integer> output = new ArrayList<Integer>();
    	for(int i = 0; i < l.size(); i++){
    		int x;
    		if((x = l.get(i)) < 0){
    			output.add(x);
    		}
    	}
        return output; // remove this line when you start
    }

    /**
     * Mutates the given List by removing all of the Integers in the
     * List that are less than zero
     */
    public static void removeLessThanZero(List<Integer> l) {
    	
    	/* the way I would normally do this
    	for(int i = l.size() - 1; i >= 0; i--){
    		if(l.get(i) < 0){
    			l.remove(i);
    		}
    	}
    	*/
    	ListIterator<Integer> it = l.listIterator(); 
    	while(it.hasNext()){
    		if( it.next() < 0){
    			it.remove();
    		}
    	}
    }

    /**
     * Returns a new Set that contains all of the elements in a and
     * all of the elements in b (i.e. the union of two sets).
     */
    public static Set<Integer> union(Set<Integer> a, Set<Integer> b) {
    	Set<Integer> output = new HashSet<Integer>();
        output.addAll(a);
        output.addAll(b);
        return output;
    }

    /**
     * Returns a new Set that contains all of the elements that are
     * in a and also in b (i.e. the intersection of two sets).
     */
    public static Set<Integer> intersection(Set<Integer> a, Set<Integer> b) {
    	Set<Integer> output = new HashSet<Integer>();
    	output.addAll(a);
    	output.retainAll(b);
        return output;
    }

    /**
     * Returns a new Set that contains all of the elements in a that
     * are not in b (i.e. the difference of a from b, or a subtract b).
     */
    public static Set<Integer> difference(Set<Integer> a, Set<Integer> b) {
    	Set<Integer> output = new HashSet<Integer>();
    	output.addAll(a);
    	output.removeAll(b);
        return output; 
    }

    /**
     * Returns a new Map that contains a reverse mapping of the given map.
     * Thus each key in the given map will appear as a value in the result,
     * and each value in the given map will appear as a key in the result.
     *
     * Because a Map contains a many to one mapping (i.e. two keys can map
     * to the same value), to properly return a reverse mapping each key
     * in the result could have multiple values. To represent this, each key
     * in the result has a Set as its mapped value where the Set contains
     * all of the multiple values.
     *
     * See the test class for a concrete example.
     */
    public static Map<String, Set<String>> reverseMapping(Map<String, String> mapping) {
    	Set<String> keySet = mapping.keySet();
    	Set<String> valueSet = new HashSet<String>();
    	Map<String, Set<String>> output = new HashMap<String, Set<String>>();
    	Set<String> toAdd;
    	for(String s : keySet){
    		String val;
    		if(valueSet.contains(val = mapping.get(s))){
    			toAdd = output.get(val);;
    			toAdd.add(s);
    		}else{
    			toAdd = new HashSet<String>();
    			toAdd.add(s);
    			valueSet.add(val);
    			output.put(val,toAdd);
    		}
    	}
    	
    	
        return output; 
    }
}
