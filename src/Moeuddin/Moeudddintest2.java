package Moeuddin;

public class Moeudddintest2 {
    public static String dateSTR(String date)
    {
        String output;
        output=date.substring(3,5)+"-"+date.substring(0,2)+"-"+date.substring(6,10);
        return output;
    }
}
