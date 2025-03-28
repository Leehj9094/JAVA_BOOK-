package Ch36.Tests.Controller;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import Ch36.Controller.FrontController;

class ControllerTests {

	FrontController fc = FrontController.getInstance();
	
	@Test
	void test() {
		// View에서 요청정보 담기
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/user");		// endPoint
		params.put("serviceNo", 1);			//serviceNo
		
		// 회원가입-인자전달
		params.put("userid", "ccccc");
		params.put("username", "홍길동");
		params.put("password", "1234");
		
		// 도서-인자전달
//		params.put("bookCode", "11111111");
//		params.put("bookName","나의라임오렌지나무");
//		params.put("publisher","베르베르");
//		params.put("isbn","111 111 11");
	
		
		// 요청하기
		Map<String,Object> response = fc.execute(params);
		
		// 응답확인
		for(String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
	}
	
	@Test
	
	void test2() {
		
		
	}

}
