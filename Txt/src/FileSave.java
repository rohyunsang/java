import java.io.File;
import java.io.FileWriter;

public class FileSave {

	public static void main(String[] args) {

		String text = "저장할 값입니다.";

		String fileNm = "D:\\example\\date_file.txt";

		try {

			File file = new File(fileNm);

			FileWriter fileWrite = new FileWriter(file, true);

			fileWrite.write(text);

			fileWrite.flush();

			fileWrite.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}