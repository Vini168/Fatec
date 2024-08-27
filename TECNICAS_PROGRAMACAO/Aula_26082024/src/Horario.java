
public class Horario {

	public static void main(String[] args) {
		
		String hora2   = null;
		String minuto2 = null;
		
		for (int hora = 0; hora <= 23; hora++) {
			
			if (hora <= 9) {
				hora2   = "0" + hora;
			}
			else {
				hora2 = "" + hora;
			}
			
			for (int minuto = 0; minuto <= 59; minuto++) {
				
				if (minuto <= 9) {
					 minuto2 = "0" + minuto;
				}
				else {
					minuto2 = "" + minuto;
				}
					System.out.println(hora2 + ":" + minuto2);
				}
					
			}
		}
	}
