package kalk;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
		//����������=400
		//������ ������� �� 100 ��=90
		//��������� �������=38
		int k1=400,k2=90,k3=38,r1=k2*k3,r2=k1/100;
		int s1=r2*r1,s2=r2*k2;
		int test1=13680;
		int test2=360;
		// ��������
		assertEquals((int)test2,s2);
		//assertEquals((int)test1,s2);
	}

}
