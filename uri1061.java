/*Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)
 */

package uri;

import java.io.IOException;
import java.util.Scanner;
 

public class uri1061 {
	public static void main(String[] args) throws IOException {
		 
		Scanner input =new Scanner(System.in);
		String string;
		int day_i, day_f, hour_i, hour_f, minute_i, minute_f, second_i, second_f;
		int day = 0, hour = 0, minute = 0, second = 0;
		boolean bool_h = false, bool_m = false, bool_s = false;

		string =input.next();
		day_i =input.nextInt();
			 
		hour_i =input.nextInt();
		string =input.next();
		minute_i =input.nextInt();
		string =input.next();
		second_i =input.nextInt();
			 
		string =input.next();
		day_f =input.nextInt();
			 
		hour_f =input.nextInt();
		string =input.next();
		minute_f =input.nextInt();
		string =input.next();
		second_f =input.nextInt();
			 
		if(hour_i > hour_f)
			bool_h = true;

		if(minute_i > minute_f)
			bool_m = true;

		if(second_i > second_f)
			bool_s = true;

		while(day_i != day_f)
		{
			day++;
			day_i++;
		}

		while(hour_i != hour_f)
		{
			hour++;
			hour_i++;
			if(hour_i == 25)
			hour_i = 1;
		}

		while(minute_i != minute_f)
		{
			minute++;
			minute_i++;
			if(minute_i == 61)
				minute_i = 1;
		}

		while(second_i != second_f)
		{
			second++;
			second_i++;
			if(second_i == 61)
				second_i = 1;
		}

		if(bool_h == true)
			day--;

		if(bool_m == true)
			hour--;

		if(bool_s == true)
			minute--;

		System.out.print(day+" dia(s)\n");
		System.out.print(hour+" hora(s)\n");
		System.out.print(minute+" minuto(s)\n");
		System.out.print(second+" segundo(s)\n");

	}
	    
	}