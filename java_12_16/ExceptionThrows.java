package java_12_16;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class ExceptionThrows {

	public static void main(String[] args) {
		try {
			md1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void md1() throws IOException {
		md2();
	}

	public static void md2() throws IOException {
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		BufferedWriter writer = null;
		writer = Files.newBufferedWriter(file);	// IOException �߻� ����
		writer.write('A');	// IOException �߻� ����
		writer.write('Z');	// IOException �߻� ����

		if (writer != null)
			writer.close();
	}

}
