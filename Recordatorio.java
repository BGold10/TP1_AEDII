package aed;

public class Recordatorio {
    private String el_mensaje;
    private Fecha fecha_recordatorio;
    private Horario horario_recordatorio;
    
    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        el_mensaje = new String(mensaje);
        fecha_recordatorio = new Fecha(fecha);
        horario_recordatorio = new Horario(horario.hora(), horario.minutos());
    }

    public Horario horario() {
        return horario_recordatorio;
    }

    public Fecha fecha() {
        Fecha nueva_fecha = new Fecha(fecha_recordatorio);
        return nueva_fecha;
    }

    public String mensaje() {
        return el_mensaje;
    }

    @Override
    public String toString() {
        String mensaje = String.valueOf(el_mensaje);
        String fecha = " @ " + String.valueOf(fecha_recordatorio);
        String horario = " " + String.valueOf(horario_recordatorio);
        return mensaje + fecha + horario;
    }

    @Override
    public boolean equals(Object otro) {
        boolean res = false;
        boolean otroEsNull = (otro == null);
        boolean distintaClase = (otro.getClass() != this.getClass());
        if (otroEsNull || distintaClase){
            return false;
        } else {
            Recordatorio recordatorio_nuevo = (Recordatorio) otro;
            if (recordatorio_nuevo.mensaje() == el_mensaje && recordatorio_nuevo.fecha() == fecha_recordatorio && recordatorio_nuevo.horario() == horario_recordatorio){
                res = true;
            }
        }
        return res;
    }

}
