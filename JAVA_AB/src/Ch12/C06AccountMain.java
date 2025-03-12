package Ch12;
class Bank {
	// 속성 (멤버 변수) 선언
		private String accounNumber;		// 계좌번호
		private int balance;				// 계좌잔액
		// 생성자
		public Bank(String accountNumber, int balance) {
			this.accounNumber = accountNumber;
			this.balance = balance;
		}
		
		// 입금 메서드
		public void deposit(int amount) {
			// 입금을 시켜주는 기능 == 입금 금액을 받아 내 통장잔약(balance)에 추가
			balance += amount;
			System.out.println("입금 완료, 현재 잔액 : $" + balance);
			
		}
		// 출금 메서드
		public void withdraw(int amount) {
			// 내 통장잔액 >= amount 일때
			if (balance >= amount) {
			balance -= amount;
			System.out.println("[SYSTEM] : 출금 완료, 현재 잔액 : $" + balance);
			} else {
			// 내 통장잔엑 < amount 일 때
			System.out.println("[SYSTEM] : 잔액이 부족합니다.");
			}
			
		}
		// 잔액 확인 메서드
//public void balanceInfo() {
//	System.out.print("[SYSTEM] : 현재 잔액 : $" + balance);
//}
		
		// ### Getter와 Setter ###
		// 객체 지향 프로그래밍에서 클래스의 속성(멤버 변수)에 접근(Getter)하거나 값을 설정(Setter)하기 위한 메서드
		
		// Getter() 메서드( == 접근자 메서드) 지정
		// GEtter : private 속성을 읽어오는 기능(메서드)
		// 1. 메서드 이름 : get속성()
		// Ex)
		//public int getBalance() {
		// return balance;
		// }
		
		// Setter() 메서드( == 설정자 메서드 ) 지정
		// Setter : private 속성을 설정하는 기능(메서드)
		//1. 메서드 이름 : set 속성()
		// Ex)
		//public int setAccountNumber(String newAccount) {
		// this.accountNumber = newAccount
		// }
		
		// 잔액 Getter 메서드
		public int getBalance() {
			return balance;
		}
		
		// Getter 확용한 balanceInfo(), 잔액 확인 메서드
		public void balanceInfo() {
			System.out.println("[SYSTEM] : 현재 잔액 : $" + getBalance());
		}
			
		}
		

public class C06AccountMain {
	public static void main(String[] args) {
		Bank toss = new Bank("123-1234-1111", 10000000);
		toss.deposit(19000);
		toss.withdraw(20200);
		
		
	}

}
