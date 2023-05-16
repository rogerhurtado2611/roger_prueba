package GIThubPrueba;


import java.util.*;

public class RogerHELLO {

	public static void main(String[] args) {
		System.out.println("Hola Soy Roger Hurtado!!");

		
		Scanner sc =new Scanner(System.in);
	       
        int sp=0;
        for (int i=0; i<5; i++){
            System.out.print("A"+i+",");
            int A =sc.nextInt();
            sp = sp + A;
            
        }
        
       System.out.println("la suma es: "+sp);
        
    }
		
		


}
