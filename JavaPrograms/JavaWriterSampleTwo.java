import java.io.FileWriter;
import java.io.IOException;
public class JavaWriterSampleTwo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String s1="Portrait of the lady on fire";
		String s2="Old Trafford";
		String file= "C:Atom.txt";
		
		FileWriter f= new FileWriter(file);
		for(int i=0;i<s1.length();i++)
		{
			f.write(s1.charAt(i));
		}
		
		char[] c={'a','b','c'};
		f.write(c);
		f.write(s2,0,3);
		f.append("its a goal");
		f.append(s1,2,6);
		f.write('a');
		System.out.println(f.getEncoding());
		f.flush();
		f.close();
		System.out.println("Finished Writing");
	}
		
		
		
	}