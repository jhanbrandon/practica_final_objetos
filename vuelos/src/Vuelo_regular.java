class Vuelo_regular extends Vuelos {
    String horario_de_salida;

    public Vuelo_regular(String origen, String destino, int plaza, String duracion, String horario_de_salida) {
        super(origen, destino, plaza, duracion);
        this.horario_de_salida = horario_de_salida;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Vuelo Regular: " + origen + " -> " + destino + ", Duración: " + duracion + ", Horario de Salida: " + horario_de_salida);
    }
}