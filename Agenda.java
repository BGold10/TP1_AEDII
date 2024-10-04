package aed;

public class Agenda {
    private Fecha fecha;
    private Recordatorios [] recordatorios;
    public Agenda(Fecha fechaActual) {
        fecha = fechaActual;
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        recordatorios = recordatorios + recordatorio;
    }

    @Override
    public String toString() {
        String fecha = String.valueOf(fecha) + "\n ===== \n";

        return fecha;
    }

    public void incrementarDia() {
        // Implementar
    }

    public Fecha fechaActual() {
        Fecha nueva_fecha = new Fecha(fecha_recordatorio);
        return nueva_fecha;
    }

}
