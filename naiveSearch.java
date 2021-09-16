/******************************************************************************

Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], char txt[]) that prints all occurrences of pat[] in txt[]. You may assume that n > m. 

*******************************************************************************/
// Java program for Naive Pattern Searching
public class Main{
 
    public static void search(String txt, String pat)
    {
       int stringLength=txt.length();
       int patLength=pat.length();
       int j;
       for(int i=0;i<stringLength-patLength;i++)
       {
           for( j=0;j<patLength;j++)
           {
               if(txt.charAt(i+j)!=pat.charAt(j))
                    break;
           }
           if(j==patLength)
                System.out.println("Found at "+i);
       }
        
    }
 
    public static void main(String[] args)
    {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        search(txt, pat);
    }
}