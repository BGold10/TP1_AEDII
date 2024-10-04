package aed;

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio[] recordatorios; 
    public ArregloRedimensionableDeRecordatorios() {
        recordatorios = new Recordatorio[0];
    }

    public int longitud() {
        int res = recordatorios.size();
        return res;
    }

    public void agregarAtras(Recordatorio i) {
        recordatorios = recordatorios + i;
    }

    public Recordatorio obtener(int i) {
        Object res = null;
        if (recordatorios.contain(i)){
            res = recordatorios.get(i);
        }
        return res;
    }

    public void quitarAtras() {
        recordatorios.remove(longitud());
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        recordatorios[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        ArregloRedimensionableDeRecordatorios arreglo_nuevo = new ArregloRedimensionableDeRecordatorios(vector);
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios arreglo_copia = ArregloRedimensionableDeRecordatorios(recordatorios);
        return arreglo_copia;
    }
}
