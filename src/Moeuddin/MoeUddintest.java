package Moeuddin;

public class MoeUddintest {
    public static String isPalindrome(String input)
    {
        String output1="";

        int x=0;
        int y=input.length();
        while(input.length() > x )
        {
            String s2=input.substring(y-1,y);
            String s1=input.substring(x,x+1);
            if(s1.equals(s2))
            {
                output1 = output1 + s2;
            } else
            {


                output1="It isnt a palidrome";
                return output1;
            }
            x++;
            y--;





        }
        return ( "It is a palindrome " +output1);
    }
}
