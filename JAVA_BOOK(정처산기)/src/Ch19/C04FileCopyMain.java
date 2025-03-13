package Ch19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class C04FileCopyMain {

	private static String FileDir = "C:\\IOTEST\\";
	
	public static void main(String[] args) throws IOException {			// args[0] 원본파일 args[1] 대상파일
	
		Reader fin = new FileReader("C:\\IOTEST\\test3.txt");
		int data = 0;
		
		StringBuffer buffer = new StringBuffer();
		
		char [] buf = new char[1024];				// 1024byte
//		fin.read(buf);									// read(char[] cbuf)는 char 갯수를 리턴
		
		long startTime = System.currentTimeMillis();
		while((data = fin.read(buf)) != -1) {				// read 사용 시 시간이 좀 오래 걸림 - 문자를 하나씩 하나씩 검색해서 일하는
//			buffer.append((char)data);
			buffer.append(buf);
		}
		long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("소요시간 : " + (endTime-startTime) + "ms");
//		System.out.println(buffer);
		
		fin.close();
	}
}
