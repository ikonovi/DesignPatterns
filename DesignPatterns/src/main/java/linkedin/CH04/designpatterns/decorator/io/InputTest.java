package linkedin.CH04.designpatterns.decorator.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

public class InputTest {
	
	public static void main(String[] args) throws IOException {
		int c;
		String testFile = Paths
				.get("target" + File.separator + "classes" + File.separator + "linkedin" + File.separator + "test.txt")
				.toAbsolutePath().toString();
		System.out.println("File Location - " + testFile);

		try {
			InputStream in = 
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream(testFile)));
			while((c = in.read()) >= 0) {
				System.out.print((char) c);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
