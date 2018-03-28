//http://bigfile.mail.naver.com/bigfileupload/download?fid=w9FG14lCM6/lK3YwHr05FAgZHqUmKx2mKqg9KoKmFxErHqu9KoU/FxKlaxvjp6UqFAtXFA3vKA2XaxvlM6F4FztlKxudMqIvMqI4K4E
//윈도xp 
//http://bigfile.mail.naver.com/bigfileupload/download?fid=wr+G14lCM6/dKCYZHr05aAtqHqUmKx2mKqg9KoUqKxgqHqu9KoU/FxKlaxvjK4tlK6UwFAu9FqgdFxEmpA2rK6pCaA+vKob9MxErKAv
//시큐어코딩


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	
	VendingMachine vm;
	
	@Before
	public void setUp() {
		vm = new VendingMachine();
	}
	
	@Test
	public void test() {
		vm.inputMoney(2000);
		assertEquals(2000, vm.showMoney());
	}
	
	@Test
	public void test_상품선택시_입금액에서상품차감() {
		vm.inputMoney(2000);
		assertEquals(2000, vm.showMoney());
		vm.chooseProduct(1350);
		assertEquals(2000-1350, vm.showMoney());
	}
	
	@Test
	public void test_잔액천원이상_천원지급() {
		vm.inputMoney(3000);
		assertEquals(3000, vm.showMoney());
		vm.chooseProduct(1350);
		assertEquals(3000-1350, vm.showMoney());
		int bills = vm.billsToReturn();
		assertEquals((3000-1350)/1000, bills);
		assertEquals((3000-1350)-(1000*bills), vm.showMoney());
	}
	
	@Test
	public void test_잔액천원미만() {
		vm.inputMoney(2000);
		assertEquals(2000, vm.showMoney());
		vm.chooseProduct(1350);
		assertEquals(2000-1350, vm.showMoney());
		int bills = vm.billsToReturn();
		assertEquals(0, bills);
	}
	
	@Test
	public void test_잔액이_천원미만_오백원이상인경우_오백원하나지급() {
		vm.inputMoney(1000);
		vm.chooseProduct(350);
		assertEquals(1, vm.coinsOf500ToReturn());
		assertEquals((1000-350)-(500*1), vm.showMoney());
	}
	
	@Test
	public void test_잔액이_오백원미만인경우_오백원갯수는0개() {
		vm.inputMoney(500);
		vm.chooseProduct(350);
		int coinsOf500 = (500 - 350) / 500;
		assertEquals(0, vm.coinsOf500ToReturn());
	}
	
	@Test
	public void test_잔액이_오백원미만_백원이상인경우_백원하나지급() {
		vm.inputMoney(500);
		vm.chooseProduct(350);
		assertEquals(1, vm.coinsOf100ToReturn());
		assertEquals((500-350)-(100*1), vm.showMoney());
	}
	
	@Test
	public void test_잔액이_백원미만인경우_오십원하나지급() {
		vm.inputMoney(500);
		vm.chooseProduct(450);
		assertEquals(1, vm.coinsOf50ToReturn());
		assertEquals((500-450)-(50*1), vm.showMoney());
	}
	
	@Test
	public void test_잔액이_오십원미만인경우_미지급() {
		vm.inputMoney(500);
		vm.chooseProduct(460);
		assertEquals(0, vm.coinsOf50ToReturn());
		assertEquals((500-460)-(50*0), vm.showMoney());
	}
	
	@Test
	public void test_잔액이_오십원미만인경우_십원하나지급() {
		vm.inputMoney(500);
		vm.chooseProduct(490);
		assertEquals(1, vm.coinsOf10ToReturn());
		assertEquals((500-490)-(10*1), vm.showMoney());
	}
	
	@Test
	public void test_전체계산() {
		vm.inputMoney(3000);
		vm.chooseProduct(1340);
		vm.calculate();
		vm.display();
	}
	
	@Test
	public void test_전체계산2() {
		vm.inputMoney(2000);
		vm.chooseProduct(1340);
		vm.calculate();
		vm.display();
	}

}
