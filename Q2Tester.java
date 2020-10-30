package lab4;
import java.io.*;
public class Q2Tester {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = "";
		sentence = br.readLine();
		BufferedWriter bw = new BufferedWriter(new FileWriter("demo2.txt"));
		bw.write(sentence);
		System.out.println("Data written on file successfully");
		bw.close();
		br.close();
	}
}
