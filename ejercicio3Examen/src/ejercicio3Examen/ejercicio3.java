package ejercicio3Examen;

public class ejercicio3 {


	public String diaSemana(int dia) {
		String result = "";
		if(dia == 1) {
			result = "Lunes";
		}else if(dia == 2) {
			result = "Martes";
		}else if(dia == 3) {
			result = "Miercoles";
		}else if(dia == 4) {
			result = "Jueves";
		}else if(dia == 5) {
			result = "Viernes";
		}else if(dia == 6) {
			result = "Sabado";
		}else if(dia == 7) {
			result = "Domingo";
		}else {
			result = "ERROR!";
		}
		return result;
	}
}
