package src2.tareas;

import libs.Input;

public class InicialesFacil {

	public static void main(String[] args) {
		Input.print("Nombre completo");
		String nombre=Input.get_string();
		ImprimirIniciales(nombre);

	}
	
	public static void ImprimirIniciales (String n)
	{
		//(n.matches("([a-z]|[A-Z]|\\s)+")
				
			for(int i=0; i<n.length();i++)
			{
				if(n.charAt(i)>= 'A' && n.charAt(i) <= 'Z')
				{
					System.out.print(n.charAt(i));
				}
			}	
		
		
		
		
		
		/*
		 * 	do
		{
			//for...
		}
		while (n.matches("([a-z]|[A-Z]|\\s)+"));
		return n;
		 * 
		 * */
		
		
	}
	
	/*2.  Utilizar la funcion split()
	s.split(" ")
	["Regulus", "Arcturus", "Black"]
	Regulus.charAt(0) imprimirlo
	Arcturus.charAt(0) imprimirlo
	etc...*/

}
