package src1.tareas;

import libs.Input;

public class BotellasAgua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		int m=get_minutes();



		int b = m*12;
		System.out.println("Botellas: " + b);


	}

	public static int get_minutes()
	{
		int n;
		do
		{
			//Input.print("n is ");
			System.out.print("Minutos: ");
			n = Input.get_int();
		}
		while (n <= 0);

		return n;

	}

}
