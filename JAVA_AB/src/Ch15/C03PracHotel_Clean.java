package Ch15;

// 부모클래스 : 호텔(Hotel)
class Hotel {
	String name;
	String location;

	public Hotel(String name, String location) {
		this.name = name;
		this.location = location;
	}
}

class LuxuryHotel extends Hotel {
	// 별점
	int starCount;

	public LuxuryHotel(String name, String location, int starCount) {
		super(name, location);
		this.starCount = starCount;
	}

	@Override
	public String toString() {
		return "LuxuryHotel [starCount=" + starCount + ", name=" + name + ", location=" + location + "]";
	}

}

class ThemeHotel extends Hotel {
	// 테마
	String theme;

	public ThemeHotel(String name, String location, String theme) {
		super(name, location);
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "ThemeHotel [theme=" + theme + ", name=" + name + ", location=" + location + "]";
	}

}

//[결과값]
// === 럭셔리 호텔 정보 ===
// 호텔 이름 : 힐튼
// 위치	 : 서울
// 별점 	 : 5 stars
// 
// === 테마 호텔 정보 ===
// 호텔 이름 : 디즈니 호텔
// 위치     : 파리
// 테마	 : 디즈니 캐릭터 테마
public class C03PracHotel_Clean {
	public static void ShowInfo(Hotel obj) {
		System.out.println(obj.toString());
	}

	public static void main(String[] args) {

		// 럭셔리 호텔 객체 생성
		LuxuryHotel lxH = new LuxuryHotel("힐튼", "서울", 5);

		// 테마 호텔 객체 생성
		ThemeHotel tmH = new ThemeHotel("디즈니 호텔", "파리", "디즈니 캐릭터 테마");
		ShowInfo(lxH); // 럭셔리 호텔 정보 출력
		System.out.println();
		ShowInfo(tmH); // 테마 호텔 정보 출력
	}
}
