package kalk;

import static org.junit.Assert.*;

import org.junit.Test;

public class test3 {

	@Test
	public void test() {
		//����������=1200
		//������ ������� �� 100 ��=10
		//��������� �������=40
		int k1=1200,k2=10,k3=40,r1=k2*k3,r2=k1/100;
		int s1=r2*r1,s2=r2*k2;
		int test1=4800;
		int test2=120;
		// ��������
		assertEquals((int)test2,s2);
		//assertEquals((int)test1,s2);
	}

}
