package org.example;
import enums.TipoEmbalaje;
import enums.TipoTransporte;
public class Main {

    /**
     * static ITransporte Transporte
     */
    static ITransporte Transporte;

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {

        //IMPLEMENTACIÓN DE BICICLETA
        System.out.println("Biclicleta:");
        Transporte = FactorySencilla.getProducto(TipoTransporte.Bicicleta);
        System.out.println(Transporte.costoTotal(36470));
        /**
         * Con "evalue" un tipo enumerado en Java es un tipo “especial” que en cierta medida puede usarse
         * como una clase y admite ciertas posibilidades especiales.
         */
        System.out.println(TipoEmbalaje.values()[Transporte.tipoEmbalaje(36470,2f,3f,5f,6f)]);
        System.out.println(Transporte.tipoEmbalaje(36470,2f,3f,5f,6f));

        //IMPLEMENTACIÓN DE CAMIÓN
        System.out.println("Camion:");
        Transporte = FactorySencilla.getProducto(TipoTransporte.Camion);
        System.out.println(Transporte.costoTotal(36470));
        System.out.println(TipoEmbalaje.values()[Transporte.tipoEmbalaje(36470,2f,3f,5f,6f)]);
        System.out.println(Transporte.tipoEmbalaje(36471,2f,3f,5f,6f));

        //IMPLEMENTACIÓN DE BARCO
        System.out.println("Barco:");
        Transporte = FactorySencilla.getProducto(TipoTransporte.Barco);
        System.out.println(Transporte.costoTotal(36470));
        System.out.println(TipoEmbalaje.values()[Transporte.tipoEmbalaje(36470,200f,300f,500f,600f)]);
        System.out.println(Transporte.tipoEmbalaje(36469,30f,30f,20f,40f));


    }
}