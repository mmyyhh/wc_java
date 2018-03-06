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
	public void test_��ǰ���ý�_�Աݾ׿�����ǰ����() {
		vm.inputMoney(2000);
		assertEquals(2000, vm.showMoney());
		vm.chooseProduct(1350);
		assertEquals(2000-1350, vm.showMoney());
	}
	
	@Test
	public void test_�ܾ�õ���̻�_õ������() {
		vm.inputMoney(3000);
		assertEquals(3000, vm.showMoney());
		vm.chooseProduct(1350);
		assertEquals(3000-1350, vm.showMoney());
		int bills = vm.billsToReturn();
		assertEquals((3000-1350)/1000, bills);
		assertEquals((3000-1350)-(1000*bills), vm.showMoney());
	}
	
	@Test
	public void test_�ܾ�õ���̸�() {
		vm.inputMoney(2000);
		assertEquals(2000, vm.showMoney());
		vm.chooseProduct(1350);
		assertEquals(2000-1350, vm.showMoney());
		int bills = vm.billsToReturn();
		assertEquals(0, bills);
	}
	
	@Test
	public void test_�ܾ���_õ���̸�_������̻��ΰ��_������ϳ�����() {
		vm.inputMoney(1000);
		vm.chooseProduct(350);
		assertEquals(1, vm.coinsOf500ToReturn());
		assertEquals((1000-350)-(500*1), vm.showMoney());
	}
	
	@Test
	public void test_�ܾ���_������̸��ΰ��_�����������0��() {
		vm.inputMoney(500);
		vm.chooseProduct(350);
		int coinsOf500 = (500 - 350) / 500;
		assertEquals(0, vm.coinsOf500ToReturn());
	}
	
	@Test
	public void test_�ܾ���_������̸�_����̻��ΰ��_����ϳ�����() {
		vm.inputMoney(500);
		vm.chooseProduct(350);
		assertEquals(1, vm.coinsOf100ToReturn());
		assertEquals((500-350)-(100*1), vm.showMoney());
	}
	
	@Test
	public void test_�ܾ���_����̸��ΰ��_���ʿ��ϳ�����() {
		vm.inputMoney(500);
		vm.chooseProduct(450);
		assertEquals(1, vm.coinsOf50ToReturn());
		assertEquals((500-450)-(50*1), vm.showMoney());
	}
	
	@Test
	public void test_�ܾ���_���ʿ��̸��ΰ��_������() {
		vm.inputMoney(500);
		vm.chooseProduct(460);
		assertEquals(0, vm.coinsOf50ToReturn());
		assertEquals((500-460)-(50*0), vm.showMoney());
	}
	
	@Test
	public void test_�ܾ���_���ʿ��̸��ΰ��_�ʿ��ϳ�����() {
		vm.inputMoney(500);
		vm.chooseProduct(490);
		assertEquals(1, vm.coinsOf10ToReturn());
		assertEquals((500-490)-(10*1), vm.showMoney());
	}
	
	@Test
	public void test_��ü���() {
		vm.inputMoney(3000);
		vm.chooseProduct(1340);
		vm.calculate();
		vm.display();
	}
	
	@Test
	public void test_��ü���2() {
		vm.inputMoney(2000);
		vm.chooseProduct(1340);
		vm.calculate();
		vm.display();
	}

}
