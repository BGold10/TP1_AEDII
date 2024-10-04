package aed;

public class Horario {
    private int hora_actual;
    private int minuto_actual;

    public Horario(int hora, int minutos) {
        hora_actual = hora;
        minuto_actual = minutos;
    }

    public int hora() {
        return hora_actual;
    }

    public int minutos() {
        return minuto_actual;
    }

    @Override
    public String toString() {
        String res = String.valueOf(hora_actual) + ':' + String.valueOf(minuto_actual);
        return res;
    }

    @Override
    public boolean equals(Object otro) {
        boolean res = false;
        boolean otraEsNull = (otro == null);
        boolean distintaClase = (otro.getClass() != this.getClass());
        if (otraEsNull || distintaClase){
            return false;
        } else {
            Horario horario_nuevo = (Horario) otro;
            if (horario_nuevo.hora() == hora_actual && horario_nuevo.minutos() == minuto_actual){
                res = true;
            }
        }
        
        
        return res;
    }

}
