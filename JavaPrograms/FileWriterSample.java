import java.io.FileWriter;

import java.io.IOException;

public class FileWriterSample {

      public static void main(String[] args)throws IOException

      {

                  String str="This is just some sample content for writing into a file";

                  FileWriter f=new FileWriter("D:sampleoutputWriter.txt");

                  for(int i=0;i<str.length();i++)

                  {

                                  f.write(str.charAt(i));

                  }

                  f.write("\n");

                  

                  char[] arr= {'a','b','c','d','e','f','g','h','i'};

                  f.write(arr); 

                  f.write("\n");

                  

                  f.write(arr,1,5);

                  f.write("\n");

                  

                  f.write("Hello!! good morining");

                  f.write("\n");

                  

                  f.write(str,6,14);

                  f.write("\n");

                  f.write('A');

                  f.write("\n");

                  f.write(67);

                  f.flush();

                  f.write("THE END OF THE FILE...");

                  System.out.println("finished writing");

                  f.close();

      }

}