/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * DIEGO DE JESÚS ARREDONDO TURCIOS
 * 19422
 * CC2003 SECCION 30
 * */
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class VectorHeapTest {

	@Test
	void testVectorHeapAdd() throws FileNotFoundException {
		VectorHeap<Paciente> vector = new VectorHeap<Paciente>();
		String directorioNuevo = System.getProperty("user.dir");
        Scanner inputScan = new Scanner(new File(directorioNuevo + "\\src\\pacientes.txt"));
        while (inputScan.hasNextLine()) {
            String[] line = inputScan.nextLine().split(", ");
            vector.add(new Paciente(line[0], line[1], line[2]));
        } 
	}
	
	@Test
	void testVectorHeapRemove() throws FileNotFoundException {
		VectorHeap<Paciente> vector = new VectorHeap<Paciente>();
		String directorioNuevo = System.getProperty("user.dir");
        Scanner inputScan = new Scanner(new File(directorioNuevo + "\\src\\pacientes.txt"));
        while (inputScan.hasNextLine()) {
            String[] line = inputScan.nextLine().split(", ");
            vector.add(new Paciente(line[0], line[1], line[2]));
        } 
        System.out.println("Lista De Prioridad Del Hospital");
        System.out.println(vector.size());
        int cantidad = vector.size();
        for (int i = 0; i < cantidad; i++) {
        	Paciente paciente = vector.remove();
    		System.out.println((i+1) + ". " + paciente.getNombre() + " con padecimiento: " + paciente.getPadecimiento());
    	}
	}
	
}
