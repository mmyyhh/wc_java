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

}
