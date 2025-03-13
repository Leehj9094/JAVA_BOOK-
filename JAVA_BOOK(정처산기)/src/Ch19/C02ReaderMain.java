package Ch19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;

public class C02ReaderMain {

	public static void main(String[] args) throws IOException {
		
		Reader fin = new FileReader("C:\\IOTEST\\test1.txt");		// 내용 불러올때 사용하면 유용하게 사용됨
		int data = 0;
		String str;
		StringBuffer buffer = new StringBuffer();
		while((data = fin.read()) != -1) {
//			int data = fin.read();
//			if(data==-1)
//				break;
		
			System.out.print((char)data);
			buffer.append((char)data);
//			str.concat((char)data + "");
		}
		System.out.println();
		System.out.println(buffer);
		
		fin.close();
	}
}
