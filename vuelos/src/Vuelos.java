abstract class Vuelos {
    String origen;
    String destino;
    int plaza;
    String duracion;

    public Vuelos(String origen, String destino, int plaza, String duracion) {
        this.origen = origen;
        this.destino = destino;
        this.plaza = plaza;
        this.duracion = duracion;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public abstract void mostrarDetalles();
}