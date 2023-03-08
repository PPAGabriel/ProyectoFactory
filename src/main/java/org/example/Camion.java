package org.example;
import enums.TipoEmbalaje;

public class Camion implements ITransporte{

    /**
     * @return precio
     */
    @Override
    public Float costoTotal(Integer cp) {
        Float precio = null;
        Integer codigo = 37382;
        precio = (float) ((codigo - cp) * 2.8);
        if (cp > 36791 || cp < 34908) {
            EntradaSalida.salida("Fuera de la zona ", EntradaSalida.SALIDA_CONSOLA);
        }

        if (precio == 0) ;
        return precio;
    }
    /**
     * @return total
     */
    @Override
    public Integer tipoEmbalaje(Integer cp, Float dimensionX, Float dimensionY, Float dimensionZ, Float peso) {

        float TotalDimension = dimensionX + dimensionY + dimensionZ;
        if (TotalDimension <= 180 && peso <= 20) {
            return TipoEmbalaje.Pallet.ordinal();

        } else if (TotalDimension <= 350 && peso <= 800) {
            return TipoEmbalaje.CajaMadera.ordinal();

        } else {
            return TipoEmbalaje.CajaCarton.ordinal();
        }
    }
}
