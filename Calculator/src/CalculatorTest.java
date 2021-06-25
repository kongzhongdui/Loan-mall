import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testJia() {
		Calculator calculator = new Calculator();
		System.out.println(calculator.jia(1,2));
	}


	@Test
	void testJian() {
		Calculator calculator = new Calculator();
		System.out.println(calculator.jian(5,2));
	}


	@Test
	void testCheng() {
		Calculator calculator = new Calculator();
		System.out.println(calculator.cheng(2,5));
	}


	@Test
	void testChu() {
		Calculator calculator = new Calculator();
		System.out.println(calculator.chu(6,3));
	}


	@Test
	void testPingfang() {
		Calculator calculator = new Calculator();
		System.out.println(calculator.pingfang(5));
	}


	@Test
	void testLifang() {
		Calculator calculator = new Calculator();
		System.out.println(calculator.lifang(5));
	}


	@Test
	void testFanhui() {
		Calculator calculator = new Calculator();
		System.out.println(calculator.fanhui());
	}


	@Test
	void testLianjia() {
		Calculator calculator = new Calculator();
		System.out.println(calculator.lianjia(3));
	}


	@Test
	void testGuiling() {
		Calculator calculator = new Calculator();
		System.out.println(calculator.guiling());
	}


	@Test
	void testDengyu() {
		Calculator calculator = new Calculator();
		System.out.println(calculator.dengyu(7));
	}


}
