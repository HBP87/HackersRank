import java.util.Scanner;
public class main{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    String ampm = s.nextLine();
    String pieces[];
    pieces=ampm.split(":");    //splits the original 12hr time format into an array of strings
    int hour=Integer.parseInt(pieces[0]);
    if(ampm.charAt(8)=='A' && ampm.charAt(9)=='M' && ampm.charAt(0)=='1' && ampm.charAt(1)=='2')
    {
      System.out.println("00"+":"+pieces[1]+":"+pieces[2].charAt(0)+pieces[2].charAt(1));
    }
    else if(ampm.charAt(8)=='P' && ampm.charAt(9)=='M' && ampm.charAt(0)=='1' && ampm.charAt(1)=='2')
    {
      System.out.println("12"+":"+pieces[1]+":"+pieces[2].charAt(0)+pieces[2].charAt(1));
    }
    else
    {
      if(ampm.charAt(8)=='P' && ampm.charAt(9)=='M')
      {
        hour=hour+12;
        System.out.println(hour+":"+pieces[1]+":"+pieces[2].charAt(0)+pieces[2].charAt(1));
      }
      else
      {
      System.out.println(pieces[0]+":"+pieces[1]+":"+pieces[2].charAt(0)+pieces[2].charAt(1));
      }
    }
  }
}
