package Ch14;
	
// 판매자
	class Seller {
		int saveMoney;
		int appleCnt;
		int price;
		
		public Seller(int saveMoney, int appleCnt, int price) {
			super();
			this.saveMoney = saveMoney;
			this.appleCnt = appleCnt;
			this.price = price;
		}
		public int sell(int money) {
			return money;
		//	saveMoney += money;
			
		}	
	}
	
	class Buyer {
		int myMoney;
		int appleCnt;
		
		// 구매자 
		public Buyer(int myMoney, int appleCnt) {
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		}
		
		public void pay(Seller Seller, int money) {
			myMoney -= money;
			Seller.saveMoney += money;
			appleCnt += Seller.sell(money);
			//int cnt = seller.sell(money);
			// appleCnt += sell;
		}
		@Override
		public String toString() {
			return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
		}
	}	
	

public class C03AppleMain {
	
	public static void main(String[] args) {
	Seller cat = new Seller(10000, 100, 1000);  // 보유금액, 사과개수, 사과가격
	Seller dog = new Seller(32000, 32, 800);    // 보유금액, 사과개수, 사과가격
	
	Buyer dong = new Buyer(5000, 0);  		// 보유금액, 사과보유량
	
	dong.pay(cat, 2000);
	
	System.out.println(cat);					// 보유금액, 사과개수 출력	// 12000, 98, 1000
	System.out.println(dog);					// 보유금액, 사과개수 출력	// 3000, 2
		
	}
}
