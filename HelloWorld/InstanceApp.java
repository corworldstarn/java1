import java.io.IOException;
import java.io.PrintWriter;
public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("reselt1.txt");
		p1.write("Hello 1\nHello 1 more");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("reselt2.txt");
		p2.write("Hello 2");
		p2.close();
		
		
	}

}
