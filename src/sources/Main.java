/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with CloudAxis. This 
 * information shall not be distributed or copied without written 
 * permission from the CloudAxis.
 *
 ***************************************************************************/

package sources;

import people.People;
import random.RandomProperties;

/***************************************************************************
 *<PRE>
 * 
 *  Creation Date   : 2015年10月29日
 * 
 *  Author          : Uwen
 * 
 *  Purpose         : TODO
 * 
 * 
 *  History         : TODO
 * 
 *</PRE>
 ***************************************************************************/
public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	static int i;
	public static void main(String[] args) throws Exception {
		//this method use to run one people
//		runUsual();
		
		//this method use to run random people
		runRandom();
		
		Thread.sleep(10);
		System.err.println("that is all");
	}
	
	public static void testRun(int a) throws Exception {
		
		/*
		 * this few line code is use to test user is Uwen   
		 * please close the "for()" code in the "main()" before run this code
		 */
//		People.makePeople();
//		System.out.println("the guys name is :" + People.getName());
//		System.out.println("the guys age  is :" + People.getAge());
//		System.out.println("the guys ID   is :" + People.getID());
//		System.out.println("the guys sex  is :" + People.getGender());
		
		/*
		 * this few line code is use to test random any properties
		 * please open the "for()" code in the "main()" before run this code
		 */
		RandomProperties.randomAll();
		Thread.sleep(1000);
		System.out.println("the guys-" + a + " name is :" + RandomProperties.getName());
		Thread.sleep(300);
		System.out.println("the guys-" + a + " age  is :" + RandomProperties.getAge());
		Thread.sleep(300);
		System.out.println("the guys-" + a + " ID   is :" + RandomProperties.getID());
		Thread.sleep(300);
		System.out.println("the guys-" + a + " sex  is :" + RandomProperties.getGender());
		Thread.sleep(1000);
	}
	
	//this method is run Usual
	public static void runUsual() throws Exception {
		testRun(0);
	}
	
	//this method is run Random
	public static void runRandom() throws Exception {
		i = (int) (Math.random()*10)+1;
		for (int a = 1;a <= i;a++) {
			testRun(a);
			System.out.println("\n\n");
		}
		
	}

}
