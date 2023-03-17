package org.example;
import enums.TipoEmbalaje;

public class Barco implements ITransporte{
    /**Requiere del codigo postal para calcualr el precio
     *
     * @return precio total según el codigo postal y la distancia
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

    /**Requiere del código postal, y las dimensiones del paquete
     *
     * @return tipo de Embalaje según las características del producto
     */
    @Override
    public Integer tipoEmbalaje(Integer cp, Float dimensionX, Float dimensionY, Float dimensionZ, Float peso)  {

        float totalDimension = dimensionX + dimensionY + dimensionZ;
        if (totalDimension <= 80 && peso <= 100) {
            return TipoEmbalaje.CajaCarton.ordinal();

        } else if (totalDimension <= 250 && peso <= 400) {
            return TipoEmbalaje.Pallet.ordinal();

        } else {
            return TipoEmbalaje.CajaMadera.ordinal();
        }
    }
}
