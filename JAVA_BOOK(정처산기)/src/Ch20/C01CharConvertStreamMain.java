package Ch20;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class C01CharConvertStreamMain {

	public static void main(String[] args) throws Exception {

		String str = "문자 변환 스트림 사용";

		OutputStream out = new FileOutputStream("c:\\IOTEST\\test.txt");
		OutputStreamWriter wout = new OutputStreamWriter(out);
		BufferedWriter bout = new BufferedWriter(wout);
		bout.write(str);											// 보조로 간단하게 할 수 있는
		out.write(str.getBytes(StandardCharsets.UTF_8));			// 강제로 할 수 있는
		bout.flush();
		bout.close();

//		InputStream in = new FileInputStream("c:\\tmp_io\\test.txt");
//		BufferedInputStream bin =  new BufferedInputStream(in);
//		InputStreamReader rin = new InputStreamReader(bin);
//		while(true) {
//			int data = rin.read();
//			if(data==-1)
//				break;
//			System.out.print((char)data);
//		}

	}

}
