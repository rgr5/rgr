package kalk;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public void test() {
		//����������=900
		//������ ������� �� 100 ��=10
		//��������� �������=100
		int k1=900,k2=10,k3=100,r1=k2*k3,r2=k1/100;
		int s1=r2*r1,s2=r2*k2;
		int test1=9000;
		int test2=90;
		// ��������
		assertEquals((int)test2,s2);
		//assertEquals((int)test1,s2);
	}

}
