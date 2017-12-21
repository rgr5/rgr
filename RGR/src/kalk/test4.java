package kalk;

import static org.junit.Assert.*;

import org.junit.Test;

public class test4 {

	@Test
	public void test() {
		//Расстояние=2000
		//Расход топлива на 100 км=8
		//Стоимость топлива=42
		int k1=2000,k2=8,k3=42,r1=k2*k3,r2=k1/100;
		int s1=r2*r1,s2=r2*k2;
		int test1=6720;
		int test2=160;
		// проверка
		assertEquals((int)test2,s2);
		//assertEquals((int)test1,s2);
	}

}