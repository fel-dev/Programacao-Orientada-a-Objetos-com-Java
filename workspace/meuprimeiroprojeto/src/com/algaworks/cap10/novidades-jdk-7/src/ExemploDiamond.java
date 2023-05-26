import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExemploDiamond {
	
	public static void main(String[] args) {
		List<String> nomesclientes = new ArrayList<>();
		nomesclientes.add("João");
		nomesclientes.add("Maria");

		for (String nome : nomesclientes) {
			System.out.println(nome);
		}

		Map<String, Set<String>> carrosPorFabricante = new HashMap<>();
		carrosPorFabricante.put("Chevrolet", new HashSet<>());
		carrosPorFabricante.get("Chevrolet").add("Cruze");
		// -- outro exemplo
		// Map<String, Set<String>> carrosPorFabricante = new HashMap<>();
		carrosPorFabricante.put("Chevrolet", Set.of("Cruze", "Onix"));

		for (String fabricante : carrosPorFabricante.keySet()) {
			System.out.println(fabricante + ": " + carrosPorFabricante.get(fabricante));
		}

		// -- outro exemplo, qnd vai inicializar agora
		Set<String> carrosDaVolks;
		carrosPorFabricante.put("Volks", carrosDaVolks = new HashSet<>());
		carrosPorFabricante.get("Volks").add("Gol");
	}
}
