import java.io.File;
import java.io.FileReader;
import java.io.*;

public class FileReaderSample {

    public static void main(String[] args)throws IOException

    {

                File f1=new File("D:sampleoutputWriter.txt");

                FileReader fr=new FileReader(f1);

                System.out.println(fr.ready());

               

                System.out.println("Reading character by character");

                int i;

                while((i=fr.read())!=-1)

                {

                                System.out.print((char)i);

                }

               

                System.out.println("Reading using an array");

                int len=(int)f1.length();

                char[] arr=new char[len];

                fr.read(arr,0,5);

                for(char c:arr)

                {

                                System.out.println(c);

                }

                System.out.println(fr.ready());

               

                System.out.println("reading single character");

                System.out.println((char)86);

               

                System.out.println(fr.getEncoding());

                System.out.println(fr.ready());

                fr.close();

                System.out.println("File reader is closed");

    }

}