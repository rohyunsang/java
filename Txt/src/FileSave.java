import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FileSave {

	public static void main(String[] args) {

		ArrayListLotto arrayListLotto = new ArrayListLotto();
		ArrayList<Integer> arr = arrayListLotto.arrayListLotto();
		
		System.out.println(arr);
		
		String text = " test " ;

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