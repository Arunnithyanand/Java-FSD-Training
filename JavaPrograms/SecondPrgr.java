import java.io.*;
import java.util.*;

public class SecondPrgr {
  public static void main(String[] args)
  {
  int age=13;
  if (age < 5)
  {
      throw new ArithmeticException("You cannot vaccinate now");
  }
  else
  {
      System.out.println("You can vaccinate");
  }
  System.out.println( "vaccination details..." );
  }
}