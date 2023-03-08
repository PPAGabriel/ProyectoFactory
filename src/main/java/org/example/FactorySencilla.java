package org.example;

import enums.TipoTransporte;

public class FactorySencilla {
    /**
     *
     * @param type
     * @return
     * @throws Exception
     */
    public static ITransporte getProducto(TipoTransporte type) {

        switch (type) {
            case Bicicleta:
                return new Bicicleta();

            case Camion:
                return new Camion();

            default:
                return null;
        }
    }
}
