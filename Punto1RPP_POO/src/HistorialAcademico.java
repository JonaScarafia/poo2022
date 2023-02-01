import java.util.HashMap;
import java.util.Map.Entry;

public class HistorialAcademico {

	private HashMap<Materia, Integer> materias = new HashMap<>();
	
	
	public void HistoriaAcademica() {
		
	}
	
	public String imprimirHistorial() {
		
		
		String mensaje = " Historia Academica \n";
		
		for (Entry<Materia, Integer> materia:materias.entrySet()) {
			
			mensaje = mensaje + materia.toString() + materia.getValue() +"\n";
			
		}
		
		return mensaje;
		
	}
	
	public void agregarMateria(Materia materia, Integer nota) {
		
		materias.put(materia, nota);
		
	}
	
}
