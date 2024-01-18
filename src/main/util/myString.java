package main.util;

public class myString
{
  public static String repeatString(int n, String str)
  {
    return new String(new char[n]).replace("\0", str);    
  }
}
