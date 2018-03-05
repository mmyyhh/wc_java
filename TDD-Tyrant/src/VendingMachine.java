
public class VendingMachine {
	private int money = 0;

	public void inputMoney(int money) {
		this.money += money;
	}

	public int showMoney() {
		return this.money;		
	}

	public void chooseProduct(int price) {
		money -= price;
	}

	public int billsToReturn() {
		int bills = money / 1000;
		money -= 1000*bills;
		return bills;
	}
}
