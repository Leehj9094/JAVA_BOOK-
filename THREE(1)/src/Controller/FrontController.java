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
		if (instance == null)
			instance = new FrontController();
		return instance;
	}

	private void init() {
		map.put("/BOOK", new BookController());
	}

}
