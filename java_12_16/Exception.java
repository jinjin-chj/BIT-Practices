package java_12_16;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Exception {

	public static void main(String[] args) {
		
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		BufferedWriter writer = null;

		try {
			writer = Files.newBufferedWriter(file);	// IOException �߻� ����
			writer.write('A');	// IOException �߻� ����
			writer.write('Z');	// IOException �߻� ����

			if (writer != null)
				writer.close();	// IOException �߻� ����
			
		} catch (IOException e) {
			e.printStackTrace();
			// Exception�� ����ϴ� ���ܴ� �ݵ�� ó���� �ؾ���.
			// �׷��� ������ ������ ������.
		}

	}

}
