import java.io.File;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Bienvenido al programa de centro comercial");
		boolean flag = true;
		while(flag) {
			System.out.println("Por favor, ingrese el numero de la implementacion a utilizar: ");
			System.out.println("1.PriorityQueue (JFC)");
			System.out.println("2.VectorHeap");
			int valor = ingreso.nextInt();
			if (valor == 1) {
				try {
					PriorityQueue<Paciente> queue = new PriorityQueue<Paciente>();
					String directorioNuevo = System.getProperty("user.dir");
					System.out.println(directorioNuevo + "\\src\\pacientes.txt");
		            Scanner inputScan = new Scanner(new File(directorioNuevo + "\\src\\pacientes.txt"));
		            while (inputScan.hasNextLine()) {
		                String[] line = inputScan.nextLine().split(", ");
		                queue.add(new Paciente(line[0], line[1], line[2]));
		            }
		            System.out.println("Lista De Prioridad Del Hospital");
		            int cantidad = queue.size();
		            for (int i = 0; i < cantidad; i++) {
		            	Paciente paciente = queue.remove();
						System.out.println((i+1) + ". " + paciente.getNombre() + " con padecimiento: " + paciente.getPadecimiento());
					} 
		            inputScan.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
				flag = false;
			} else if (valor == 2) {
				try {
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
		            inputScan.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
				flag = false;
			} else {
				System.out.println("Error, ingrese una opcion valida");
			}
		}			
	}
}
