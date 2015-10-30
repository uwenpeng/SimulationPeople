/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with CloudAxis. This 
 * information shall not be distributed or copied without written 
 * permission from the CloudAxis.
 *
 ***************************************************************************/

package people;

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
public class People {
	static String name;
	static int age;
	static String ID;
	static String gender;

	/*
	 * when you use this part   
	 * you will get a new people
	 */
	public People() {

	}


	/*
	 * this part was set all the properties to make a people
	 */
	public static void makePeople() {
		setName(MakeProperties.makeName());
		setAge(MakeProperties.makeAge());
		setGender(MakeProperties.makeGender());
		setID(MakeProperties.makeID());
		System.out.println("A new guy was borned");
	}

	/*
	 * this part need setting and getting all the 
	 */
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		People.name = name;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		People.age = age;
	}
	public static String getID() {
		return ID;
	}
	public static void setID(String iD) {
		ID = iD;
	}
	public static String getGender() {
		return gender;
	}
	public static void setGender(String gender) {
		People.gender = gender;
	}




}
