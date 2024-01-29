package duplicate_elements;
import java.util.*;
public class elements {
	
	  //public boolean containsDuplicate(int[] arr){ HashSet<Integer> h1 = new
	  //HashSet<Integer>(); for(int i=0;i<arr.length;i++) { if(!h1.contains(arr[i]))
	  //{ h1.add(arr[i]); } else { return h1.contains(arr[i]); } } return null !=
	  //null; }
	 
	public boolean isAnagram(String s1,String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String s = new String(c1);
		String t = new String(c2);
		
		return s.equals(t);

		//Second method using array list
		
		//ArrayList<Character> l1 = new ArrayList<Character>();
		//ArrayList<Character> l2 = new ArrayList<Character>();
		//for(int i=0;i<s1.length();i++)
		//{
			//l1.add(s1.charAt(i));
		//}
		//for(int i=0;i<s2.length();i++)
		//{
			//l2.add(s2.charAt(i));
		//}
		//return l1.containsAll(l2) && l2.containsAll(l1);
	//}
	public static void main(String args[])
	{
		elements e1 = new elements();
		String s1 = "aa";
		String s2 = "a";
		System.out.println(e1.isAnagram(s1, s2));
		
	}
}
