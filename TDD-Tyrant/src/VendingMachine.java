
public class VendingMachine {
	private int money = 0;
	
	private int billsOf1000 = 0;
	private int coinsOf500 = 0;
	private int coinsOf100 = 0;
	private int coinsOf50 = 0;
	private int coinsOf10 = 0;

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

	public int coinsOf500ToReturn() {
		int coinsOf500 = money / 500;
		money -= 500*coinsOf500;
		return coinsOf500;
	}

	public int coinsOf100ToReturn() {
		int coinsOf100 = money / 100;
		money -= 100*coinsOf100;
		return coinsOf100;
	}

	public int coinsOf50ToReturn() {
		int coinsOf50 = money / 50;
		money -= 50*coinsOf50;
		return coinsOf50;
	}

	public int coinsOf10ToReturn() {
		int coinsOf10 = money / 10;
		money -= 10*coinsOf10;
		return coinsOf10;
	}

	public void calculate() {
		this.billsOf1000 = this.billsToReturn();
		this.coinsOf500 = this.coinsOf500ToReturn();
		this.coinsOf100 = this.coinsOf100ToReturn();
		this.coinsOf50 = this.coinsOf50ToReturn();
		this.coinsOf10 = this.coinsOf10ToReturn();
	}

	public void display() {
		System.out.println("1000:"+billsOf1000);
		System.out.println("500:"+coinsOf500);
		System.out.println("100:"+coinsOf100);
		System.out.println("50:"+coinsOf50);
		System.out.println("10:"+coinsOf10);
	}
}
