package money;

public class Franc extends Money {
	private String currency;
	Franc(int amount) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.amount = amount ;
		currency = "CHF";
	}
	String currency() {
		return currency;
	}
	Money times (int multiplier){
		return new Franc (amount * multiplier);
	}
}
