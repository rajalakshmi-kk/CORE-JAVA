package string;
public class CountWords {
	 static int wordcount(String string)  
     {  
       int count=0;  
   
         char ch[]= new char[string.length()];     
         for(int i=0;i<string.length();i++)  
         {  
             ch[i]= string.charAt(i);  
             if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                 count++;  
         }  
         return count;  
     }  
	public static void main(String[] args) {
		   String string ="Java Full Stack Development";  
	       System.out.println(wordcount(string) + " words.");   
	}

}
