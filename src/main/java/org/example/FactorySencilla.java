package org.example;

import enums.TipoTransporte;

public class FactorySencilla {
    /**
     *
     * @param type, opción escogida por el usuario
     * @return el tipo de transporte idóneo para la acción
     * @throws Exception
     */
    public static ITransporte getProducto(TipoTransporte type) {

        switch (type) {
            case Bicicleta:
                return new Bicicleta();

            case Camion:
                return new Camion();

            case Barco:
                return new Barco();

            default:
                return null;
        }
    }
}
