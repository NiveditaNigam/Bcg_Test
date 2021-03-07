package BCG_Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BCGTest {

	public static void main(String[] args) {
		String [] words = new String[] {"eat","ate","tea","java","avja","apple","pplea"};
		System.out.println("jumbledCount:" + getJumbledWordCount(words));
		

	}
	
	public static int getJumbledWordCount(String []words) {
		//set to contains each word. to check exist or not.
		Set<String> s = new HashSet<String>();
		
		int jumbledCount = 0;
		//iterate on each word.
		for(String word: words) {
			//String immutable so convert to temporary char array.
			char tempArray[] = word.toCharArray();
			//Sort the temporary array of word.
			Arrays.sort(tempArray);
			//convert temporary array to String again.
			String tempString = new String(tempArray);
			
			//check if same word exist in set.
			if(s.add(tempString)) {
				jumbledCount += 1;
				
			}
			
			
		}
		return jumbledCount;
		
	}

}
