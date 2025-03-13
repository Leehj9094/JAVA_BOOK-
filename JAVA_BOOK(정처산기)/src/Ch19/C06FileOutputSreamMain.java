package Ch19;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C06FileOutputSreamMain {

	public static void main(String[] args) throws IOException {
		
		OutputStream out = new FileOutputStream("C:\\IOTEST\\test4.txt");
		out.write("가가가".getBytes(StandardCharsets.UTF_8));		// 한글은 인식이 안되므로 .getBytes
		out.write('a');
		out.write('b');
		out.write('c');
		out.flush();
		out.close();
		
	}
	
}
