/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with CloudAxis. This 
 * information shall not be distributed or copied without written 
 * permission from the CloudAxis.
 *
 ***************************************************************************/

package random;

import java.util.ArrayList;

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
public class RandomProperties {
	static String name;
	static int age;
	static String ID;
	static String gender;
	
	
	public static void randomAll() {
		randomName();
		randomAge();
		randomID();
		randomGender();
	}
	
	/*
	 * this part is make a name String for random
	 */
	public static void randomName() {
		name = "";
		int nameLength;
		nameLength = (int)(Math.random()*6)+3;
		for (int i = 0; i < nameLength; i++) {
			char tempChar = (char) ((int)(Math.random()*26)+97);
			name += tempChar;
		}
		setName(name);
	}
	
	/*
	 * this part is make age for random
	 */
	public static void randomAge() {
		age = (int)(Math.random()*99);
		setAge(age);
	}
	
	
	/*
	 * this part to make a ID   
	 * and the ID must has a format
	 */
	static int inTemp;
	public static void randomID() {
		ArrayList<Integer> mon31 = new ArrayList<>();
		mon31.add(1);mon31.add(3);mon31.add(4);mon31.add(7);mon31.add(8);mon31.add(10);mon31.add(12);
		ArrayList<Integer> mon30 = new ArrayList<>();
		mon30.add(4);mon30.add(6);mon30.add(9);mon30.add(11);
		ArrayList<Integer> mon28 = new ArrayList<>();
		mon28.add(2);
		String birthDay;
		String month;
		String birthYear = String.valueOf(2015 - getAge());
		int birthMon  = (int)(Math.random()*13);
		//sometime the day's date less than 10 , should add a "0" in the top
		if (mon31.contains(birthMon)) {
			int tempMonth = (int)(Math.random()*31);
			if (tempMonth<10) {
				birthDay = "0" + String.valueOf(tempMonth);
			} else {
				birthDay = String.valueOf(tempMonth);
			}
		}else if (mon30.contains(birthMon)) {
			int tempMonth = (int)(Math.random()*30);
			if (tempMonth<10) {
				birthDay = "0" + String.valueOf(tempMonth);
			} else {
				birthDay = String.valueOf(tempMonth);
			}
		}else {
			int tempMonth = (int)(Math.random()*28);
			if (tempMonth<10) {
				birthDay = "0" + String.valueOf(tempMonth);
			} else {
				birthDay = String.valueOf(tempMonth);
			}
		}
		//sometime the month's date less than 10 , should add a "0" in the top
		if (birthMon<10) {
			month = "0" + birthMon;
		} else {
			month = String.valueOf(birthMon);
		}
		//the ID top part's length is 6 and first is not 0
		String top = String.valueOf((int)(Math.random()*900000)+100000);
		//the ID end part's length is 4
		String end = String.valueOf((int)(Math.random()*10000));
		inTemp = Integer.valueOf(end);
		if (end.length()<2) {
			end = "000" + end;
		} else if (end.length()<3 && end.length() >= 2) {
			end = "00" + end;
		} else if (end.length()<4 && end.length() >= 3) {
			end = "0" + end;
		}
		ID = top + birthYear + month + birthDay + end ;
		setID(ID);
	}
	
	/*
	 * this part is make a gender by the ID
	 * it has Male and Female
	 */
	public static void randomGender() {
		if ((inTemp/10) % 2 == 0) {
			setGender("Male");
		} else {
			setGender("Female");
		}
	}
	
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		RandomProperties.name = name;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		RandomProperties.age = age;
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
		RandomProperties.gender = gender;
	}
}
