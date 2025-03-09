import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
  
    public static void main(String[] args) throws IOException
{ 
 BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
  int year = 2025 ;
  System.out.println("Як вас звати? ");
  String Name = (reader.readLine()); 

  System.out.println("Привiт" + Name);

  System.out.println("Скiльки вам рокiв ?");
  int Age = Integer.parseInt(reader.readLine());
  
  System.out.println("Ти народився в : " + (year - Age)); 
}
}


