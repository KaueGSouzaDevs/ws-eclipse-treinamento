package br.com.treinamento;

public class SwitchCase {

	public static void main(String[] args) {

		int diaSemana = 7;
		
		String diaSemanaTexto = "";
		
		switch(diaSemana) {
		case 1: 
			diaSemanaTexto = "Segunda";
			break;
		case 2:
			diaSemanaTexto = "Terça";
			break;	
		case 3:
			diaSemanaTexto = "Quarta";
			break;	
		case 4:
			diaSemanaTexto = "Quinta";
			break;	
		case 5:
			diaSemanaTexto = "Sexta";
			break;	
		case 6:	
		case 7:
			diaSemanaTexto = "Final de semana";
			break;
		default:
			System.out.println("Dia invalido");
			break;
		}
		
		System.out.println(diaSemanaTexto);
	}
}
