@Override
public void run() {
	while (runMinado.get()) {
		Bloque bloque = minarBloque();
		if (bloque != null) {
			System.out.println("NUEVOUE MINADO:");
			System.out.println(bloque);
			System.out.println("\n		
			// añado el bloque a mi cadena y lo propago
			try {
				servicioBloques.añadirBloque(bloque);
			servicioNodo.emitirPeticionPostNodosVecinos("bloque", bloque);
			} catch (Exception e) {
				// bloque invalido
			}
		}
	}
}
