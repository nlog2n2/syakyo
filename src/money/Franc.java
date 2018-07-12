package money;

public class Franc extends Money {
	Franc(int amount) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.amount = amount ;
	}
	Money times (int multiplier){
		return new Franc (amount * multiplier);
	}
}
