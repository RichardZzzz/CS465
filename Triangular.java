import java.util.*;
public class Triangular{
  


 static public void isTriangular (int input){
   int calcTri = 0;
   int n=0; 
   while (calcTri < input)
   {
     calcTri += n; 
     n++; 
   }
   
   if (calcTri != input) 
      System.out.println(input + " is NOT a triangular number:" + calcTri +","+ (calcTri-(n-1)));
   else 
      System.out.println(input +" is a triangular number"); 
}

}