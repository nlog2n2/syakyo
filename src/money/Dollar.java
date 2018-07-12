package money;

public class Dollar extends Money {
	Dollar(int amount) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.amount = amount ;
	}
	Money times (int multiplier){
		return new Dollar (amount * multiplier);
	}

}
