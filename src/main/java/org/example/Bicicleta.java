package org.example;
import enums.TipoEmbalaje;
public class Bicicleta implements ITransporte{

    /**
     *
     * @return precio
     */
    @Override
    public Float costoTotal(Integer cp) {
        Float precio;
        int  codigo = 37382;
        precio = (float) ((codigo - cp) * 0.1);
        if (cp >= 36791 || cp < 34908) {
            EntradaSalida.salida("Fuera de la zona ", EntradaSalida.SALIDA_CONSOLA);
        }
        return precio;
    }

    /**
     *
     * @return total
     */
    @Override
    public Integer tipoEmbalaje(Integer cp, Float dimensionX, Float dimensionY, Float dimensionZ, Float peso)  {

        float totalDimension = dimensionX + dimensionY + dimensionZ;
        if (totalDimension <= 30 && peso <= 10) {
            return TipoEmbalaje.CajaCarton.ordinal();

        } else if (totalDimension <= 250 && peso <= 100) {
            return TipoEmbalaje.Pallet.ordinal();

        } else {
            return TipoEmbalaje.CajaMadera.ordinal();
        }
    }
}
