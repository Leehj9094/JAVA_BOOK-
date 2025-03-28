package Controller;

import java.util.HashMap;
import java.util.Map;

public class FrontController {

	private Map<String, Object> map = new HashMap();
	
	private static FrontController instance;
	public FrontController() {
		System.out.println(" ");
		init();
	}
	public static FrontController getInstance() {
		if(instance==null)
			instance = new FrontController();
		return instance;
	}
	
	private void init() {
		map.put("/BOOK", new BookController());
	}
	
//	public Map<String, Object> execute(Map<String, Object> params)
//	{
//		System.out.println(" ");
//		String endPoint = (String)params.get("endPoint");
//		Controller controller = map.get(endPoint);
//		return controller.execute(params);
//	}
}
