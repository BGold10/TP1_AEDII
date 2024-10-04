package aed;

public class Fecha {
    private int dia_actual;
    private int este_mes;
    public Fecha(int dia, int mes) {
        dia_actual = dia;
        este_mes = mes;
    }

    public Fecha(Fecha fecha) {
        dia_actual = fecha.dia_actual;
        este_mes = fecha.este_mes;
    }

    public Integer dia() {
        return dia_actual;
    }

    public Integer mes() {
        return este_mes;
    }

    public String toString() {
        String res = String.valueOf(dia_actual) + '/' + String.valueOf(este_mes);
        return res;
    }

    @Override
    public boolean equals(Object otra) {
        boolean res = false;
        boolean otraEsNull = (otra == null);
        boolean distintaClase = (otra.getClass() != this.getClass());
        if (otraEsNull || distintaClase){
            return false;
        } else {
            Fecha fecha_nueva = (Fecha) otra;
            if (fecha_nueva.dia() == dia_actual && fecha_nueva.mes() == este_mes ){
                res = true;
            }
        }
        
        
        return res;
    }

    public void incrementarDia() { 
        if (dia().equals(diasEnMes(este_mes))) {
            if (mes().equals(12)) {
                dia_actual = 1;
                este_mes = 1;
            } else {
                dia_actual = 1;
                este_mes += 1;
            }
        } else {
            dia_actual += 1;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
