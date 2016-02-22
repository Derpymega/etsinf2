package librerias.estructurasDeDatos.lineales;

import librerias.estructurasDeDatos.modelos.ColaPrioridad;

/** Implementacion de una Cola de Prioridad mediante una Lista Con PI 
  *
  * @version Febrero 2014 
  */

public class LPIColaPrioridad<E extends Comparable<E>> 
    extends librerias.estructurasDeDatos.lineales.LEGListaConPI<E>
    implements ColaPrioridad<E> {
    
    /** crea una Cola de Prioridad (CP) vacia */
    public LPIColaPrioridad() { super(); }
    
    /** atendiendo a su prioridad, inserta el elemento "e" en una 
     * Cola de Prioridad (CP).
	 *
     *  @param e Elemento a agnadir a una Cola de Prioridad
     */
    public void insertar(E e) { 
        inicio();
        while (!esFin()) {
            if (e.compareTo(recuperar()) > 0) {
                super.insertar(e);
                break;
            }
            siguiente();
        }
        //TODO: test
    }
    
    /** SII !esVacia(): obtiene el elemento con maxima prioridad de 
	 * una CP.
	 *
     * @return E Elemento con maxima prioridad de una CP.
     */
    public E recuperarMin() { 
        inicio();
        return recuperar();
    }
    
    /** SII !esVacia(): obtiene y elimina el elemento con maxima 
	 *  prioridad de una CP.
     *  @return E Elemento con maxima prioridad de una CP
     */
    public E eliminarMin() { 
	    E res = recuperarMin();
        inicio();
        super.eliminar();
		return res;
        //TODO: test
    }
    
    /** Comprueba si una Cola de Prioridad esta vacia.
      * @return true si una CP esta vacia y false en caso contrario.
      */
    public boolean esVacia() { return ( super.esVacia() ); }  
}