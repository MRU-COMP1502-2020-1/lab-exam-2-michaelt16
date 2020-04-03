package lsystems;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LRuleTests {

	
	@Test
	public void test1() {
		 A_A a = new A_A();
		 char[] output = {'A', 'A'};
	       
	        char[] body = a.getBody();
	        
	        char[] stuff= {a.getMatch(), body[0]};
	        
	        assert(Arrays.equals(output, stuff));

	}
}
