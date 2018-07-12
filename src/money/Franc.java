package money;

public class Franc extends Money {
	Franc(int amount, String currency) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.amount = amount ;
		this.currency = currency;
	}

	Money times (int multiplier){
		return Money.franc(amount * multiplier);
	}
}
