
public class Movie {

	private int sumOfRate = 0;
	private int countOfRate = 0;
	
	public int averageRate() {
		if (countOfRate == 0) return 0;
		return sumOfRate / countOfRate;
	}

	public void rate(int rate) {
		countOfRate++;
		sumOfRate += rate;
	}

}
