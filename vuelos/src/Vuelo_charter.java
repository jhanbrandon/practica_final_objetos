class Vuelo_charter extends Vuelos {
    String cliente;
    String fecha_y_hora_de_salida;

    public Vuelo_charter(String origen, String destino, int plaza, String duracion, String cliente, String fecha_y_hora_de_salida) {
        super(origen, destino, plaza, duracion);
        this.cliente = cliente;
        this.fecha_y_hora_de_salida = fecha_y_hora_de_salida;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Vuelo Charter: " + origen + " -> " + destino + ", Duración: " + duracion + ", Cliente: " + cliente + ", Fecha y Hora de Salida: " + fecha_y_hora_de_salida);
    }
}