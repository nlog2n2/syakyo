package money;

public class Dollar extends Money {
	Dollar(int amount,String currency) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(amount,currency);
	}
	Money times (int multiplier){
		return Money.dollar(amount * multiplier);
	}

}
