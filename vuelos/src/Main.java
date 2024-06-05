import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Crear la lista de aeropuertos
        List<Aeropuerto> aeropuertos = new ArrayList<>();
        aeropuertos.add(new Aeropuerto("BCN01", "Barcelona - El Prat", "Barcelona", "España", 1));
        aeropuertos.add(new Aeropuerto("MAD01", "Madrid - Barajas", "Madrid", "España", 1));
        aeropuertos.add(new Aeropuerto("PAR01", "Paris - Orly", "Paris", "Francia", 1));
        aeropuertos.add(new Aeropuerto("LON01", "London - Heathrow", "Londres", "Gran Bretaña", 0));
        aeropuertos.add(new Aeropuerto("SPA01", "Sao Paulo - Guarulhos", "Sao Paulo", "Brasil", -3));

        // Crear la lista de vuelos
        List<Vuelos> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo_regular("BCN01", "MAD01", 150, "01:00", "L-15:00 X-15:00 V-15:00 D-15:00"));
        vuelos.add(new Vuelo_regular("MAD01", "BCN01", 150, "01:00", "L-18:00 J-20:00 S-20:00"));
        vuelos.add(new Vuelo_regular("BCN01", "LON01", 180, "01:05", "L-10:00 J-10:00"));
        vuelos.add(new Vuelo_regular("LON01", "BCN01", 180, "01:05", "L-15:00 J-15:00"));
        vuelos.add(new Vuelo_regular("BCN01", "LON01", 120, "01:10", "L-10:00 J-10:00"));
        vuelos.add(new Vuelo_regular("LON01", "BCN01", 120, "01:10", "J-15:10 J-15:10"));
        vuelos.add(new Vuelo_regular("LON01", "SPA01", 200, "07:00", "X-09:45 J-09:45 S-09:45"));
        vuelos.add(new Vuelo_regular("SPA01", "MAD01", 200, "07:00", "X-20:25 J-20:25 S-20:25"));
        vuelos.add(new Vuelo_charter("BCN01", "MAD01", 150, "01:00", "Viajes Condor", "1/2009/15 20:30"));
        vuelos.add(new Vuelo_charter("BCN01", "MAD01", 150, "01:00", "Viajes Condor", "1/2009/15 20:30"));
        vuelos.add(new Vuelo_charter("MAD01", "BCN01", 150, "01:00", "Viajes Condor", "1/2009/22 20:30"));
        vuelos.add(new Vuelo_charter("BCN01", "LON01", 180, "01:00", "Viaje Ilusion", "2/2009/22 20:30"));
        vuelos.add(new Vuelo_charter("LON01", "BCN01", 180, "01:00", "Viaje Ilusion", "3/2009/05 15:19"));
        vuelos.add(new Vuelo_charter("LON01", "BCN01", 180, "01:00", "Viaje Ilusion", "3/2009/05 15:19"));
        vuelos.add(new Vuelo_charter("BCN01", "LON01", 120, "01:00", "TravelPlan", "1/2009/25 15:18"));
        vuelos.add(new Vuelo_charter("SPA01", "SPA01", 120, "01:00", "TravelPlan", "1/2009/31 22:20"));
        vuelos.add(new Vuelo_charter("SIB01", "SPA01", 120, "01:00", "TravelPlan", "1/2009/31 22:20"));

        // Mostrar la lista de vuelos de salida desde cada aeropuerto
        System.out.println("Vuelos de salida desde cada aeropuerto:");
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("\nAeropuerto: " + aeropuerto.getNombre() + " (" + aeropuerto.getCodigo() + ")");
            boolean hayVuelos = false;
            for (Vuelos vuelo : vuelos) {
                if (vuelo.getOrigen().equals(aeropuerto.getCodigo())) {
                    vuelo.mostrarDetalles();
                    hayVuelos = true;
                }
            }
            if (!hayVuelos) {
                System.out.println("No hay vuelos de salida desde este aeropuerto.");
            }
        }

        // Mostrar la lista de vuelos de llegada a cada aeropuerto
        System.out.println("\nVuelos de llegada a cada aeropuerto:");
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("\nAeropuerto: " + aeropuerto.getNombre() + " (" + aeropuerto.getCodigo() + ")");
            boolean hayVuelos = false;
            for (Vuelos vuelo : vuelos) {
                if (vuelo.getDestino().equals(aeropuerto.getCodigo())) {
                    vuelo.mostrarDetalles();
                    hayVuelos = true;
                }
            }
            if (!hayVuelos) {
                System.out.println("No hay vuelos de llegada a este aeropuerto.");
            }
        }
    }
}