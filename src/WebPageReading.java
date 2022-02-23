import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WebPageReading {

	public static String getWebPage(String address) throws IOException{
		URL url = new URL(address);
		Scanner in = new Scanner(url.openStream());
		StringBuilder sb = new StringBuilder();
		while(in.hasNextLine()){
			sb.append(in.nextLine());
			sb.append('\n');
		}
		in.close();
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner consoleIn = new Scanner(System.in);
		boolean done = false;
		while(!done){

			System.out.print("Enter a web address, including http:// (or q to quit): ");
			String address = consoleIn.nextLine();

			if(address.equals("q")){
				done = true;
			}
			else {
                String s = null;
                try {
                    s = getWebPage(address);
                } catch (MalformedURLException me) {
                    System.out.println("to to prepend http:");
                } catch (IOException e){
                    System.out.println("page not found");
                }
				System.out.print(s);
			}
		}

		consoleIn.close();
	}


}
