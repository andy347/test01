package qoo.maven_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class diffTest {
	
	

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
private diff Qoo;
public void setup(){
	Qoo=new diff();	
}

	
	
	@Test
	public void testGetDiff(){
		String str1="abc";
		String str2="abx";
		String expected="GG";
		try {
			String deffResult=Qoo.getDiff(str1,str2);
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	
}
