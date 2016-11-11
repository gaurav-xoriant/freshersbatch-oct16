package com.opr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class StringGetLengthTest {
	@Parameter
	public String input;
	@Parameters
    public static Object[] data() {
        return (new Object[] {"abc","defghj","qwertyuiio"});
    }
	StringOpr s=new StringOpr(); 
	@Test
	public void testgetLength(){
		assertEquals(input.length(),s.getLength(input));
	}
}
