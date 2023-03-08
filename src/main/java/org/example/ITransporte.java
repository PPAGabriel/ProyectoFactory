package org.example;

/**
 * public interface ITransporte
 */

public interface ITransporte {
    /**
     *
     * @return costoTotal
     */
    Float costoTotal(Integer cp);

    /**
     *
     * @return tipoEmbalajae
     */
    Integer tipoEmbalaje(Integer cp, Float dimencionX, Float dimencionY, Float dimencionZ, Float peso);


}
