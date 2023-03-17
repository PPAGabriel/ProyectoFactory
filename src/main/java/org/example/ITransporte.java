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
     * @return tipoEmbalaje
     */
    Integer tipoEmbalaje(Integer cp, Float dimensionX, Float dimensionY, Float dimensionZ, Float peso);


}
