package Ch22;

import java.util.Map;
import java.util.Scanner;
import java.util.jar.Manifest;

class Memo{
	private String title;
	private String content;
	
	// parameter Constructor
	public Memo(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	// getter
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
}

public class C01Prac {

	// key : Value == 제목, 내용
	private static Map<String, Memo> map = new HashMap();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		String title = null;
		String contents ="";
		
		while (true) {
			System.out.println("-----------MEMO-------------");
			System.out.println("1. 메모하기");
			System.out.println("2. 불러오기");
			System.out.println("3. 파일로 저장");
			System.out.println("4. 종료");
			System.out.println("-----------MEMO-------------");
			System.out.print("번호 입력 <<< ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				sc.nextLine();
				System.out.println("-----------MEMO INSERT MODE-------------");
				System.out.println("제목 입력 <<< ");			//  map의 key로 저장
				title = sc.nextLine();						// 오후 할일
				// 동일한 제목으 ㅣ데이터가 존재한다면 
				// ex) map 저장구조 안에 "오후할일 (key) : "빨래(Value) 이런 데이터가 이미 있다면
				if(map.containsKey(title)){
					System.out.println("기존과 동일한 제목이 있습니다");
					break;
				}
				System.out.println("내용 입력 (종료 : -1) <<< ");
				while(true) {
					String tmp = sc.nextLine();
					if(tmp.contains("-1")) {
						break;
					}
					contents += tmp+"\n";
				}
				map.put(title, new Memo(title, contents));
				contents = "";
				System.out.println("메모가 저장되었습니다");
				System.out.println();
				break;
			
			case 2:
				sc.nextLine();
				System.out.print("불러올 메모의 제목 입력 <<< ");
				
			}
			
		}
	}
}
