import java.util.Arrays; 
 //Java 9 Features 
class FistMismatch { 
    public static void main(String[] args) 
    { 
  
      
        int a[] = { 10, 20, 30, 22, 35 }; 
  
        int b[] = { 10, 20, 30, 5 }; 
  
        // To compare both arrays 
        System.out.println("The element mismatched at index: "
                           + Arrays.mismatch(a, b)); 
    } 
} 