package utils;

import java.util.Comparator;

import Models.Contacto;

public class ContactoComparadorNumeros implements Comparator<Contacto>{
    @Override
    public int compare(Contacto o1, Contacto o2) {
        //primero comparo por el apellido alfabeticamente
        int resultComparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (resultComparacionApellido!=0) {
            return resultComparacionApellido;
        }

        int resultComparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if(resultComparacionNombre !=0){
            return resultComparacionNombre;
        }

        int resultComparacionNumero = o1.getTelefono().compareTo(o2.getTelefono());
        return resultComparacionNumero;
    }
    
}
