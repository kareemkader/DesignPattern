package Chapter3;
import java.io.*;

public class testUperCaseDecorator{
	public static void main(String[] args) {
		
		int c;
		try{
			File file=new File("/home/kareemkaz/eclipse-workspace/oop/HeadFirtDesignPattern/src/Chapter3/text.txt");
		InputStream upercase=new ToUperCaseStream(new BufferedInputStream(new FileInputStream(file)));
		while((c=upercase.read())>=0){
			System.out.print((char)c);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}