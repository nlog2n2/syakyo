package money;

public class Dollar extends Money {
	Dollar(int amount,String currency) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.amount = amount ;
		this.currency = currency;
	}
	Money times (int multiplier){
		return Money.dollar(amount * multiplier);
	}

}
