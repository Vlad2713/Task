import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Дано значення температури T в градусах Фаренгейта. Визначити
//значення цієї ж температури в градусах Цельсія. Температура по
//Цельсію TC і температура за TF Фаренгейтом TF зв'язані наступними
//співвідношенням: TC = (TF - 32) • 5/9. 

public class Task1 {
    public static void main(String[] args) throws IOException
{ 
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

    System.out.println("Фаренгейт");
float f1 = Float.parseFloat(reader.readLine());
double tc = (f1 - 32) * (5.0/9.0);

System.out.println("Значення в цельсіях:" + tc  + "градусів.");


}
}