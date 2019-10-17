paquete  com.aprendeblockchain.miblockchainenjava.commons.estructuras ;

import  java.util.ArrayList ;
import  java.util.Iterator ;
import  java.util.List ;

/ *
 * La cadena de bloques es prácticamente una lista de bloques enlazados y cada bloque tiene el identificador del bloque anterior.
* * /
 clase  pública CadenaDeBloques {

	// Lista de bloques en la cadena ordenados por altura
	 Lista privada < Bloque > bloques =  new  ArrayList < Bloque > ();
	// Saldos actuales de las cuentas
	privadas  RegistroSaldos saldos =  nuevos  RegistroSaldos ();

	 CadenaDeBloques público () {
	}

	 CadenaDeBloques público ( CadenaDeBloques  cadena ) lanza  Excepción {
		esta . setBloques (cadena . getBloques ());
	}

	 Lista  pública < Bloque > getBloques () {
		devolver bloques;
	}

	public  void  setBloques ( List < Bloque >  bloques ) lanza  Exception {
		esta . bloques =  new  ArrayList < Bloque > ();
		para ( Bloque bloque : bloques) {
			esta . agregarBloque (bloque);
		}
	}

	public  boolean  estaVacia () {
		devuelve  esto . bloques ==  nulo  ||  esta . bloques . esta vacio();
	}

	public  int  getNumeroBloques () {
		return (estaVacia () ?  0  :  this . bloques . size ());
	}

	públicas  RegistroSaldos  getSaldos () {
		devuelve  esto . saldos
	}

	/ **
	 * Obtener el ultimo bloque en la cadena
	 * * 
	 * @return Ultimo bloque de la cadena
	 * /
	public  Bloque  getUltimoBloque () {
		if (estaVacia ()) {
			volver  nulo ;
		}
		devuelve  esto . bloques . get ( this . bloques . size () -  1 );
	}

	/ **
	 * Añadir un bloque a la cadena
	 * @param bloque a ser añadido
	 * Excepción @throws
	 * /
	public void añ adirBloque ( Bloque  bloque ) lanza  Exception {

		// iteramos y procesamos las transacciones. Si todo es correcto lo añadido a la cadena
		Iterador < Transacción > itr = bloque . getTransacciones () . iterador ();

		while (itr . hasNext ()) {
			Transaccion transaccion = ( Transaccion ) itr . próximo();
			// actualizar saldos
			saldos . liquidarTransaccion (transaccion);
		}

		esta . bloques . agregar (bloque);

		Sistema . a cabo . println (saldos . toString () +  " \ n " );
	}

	@Anular
	public  boolean  equals ( Objeto  o ) {
		si ( esto  == o)
			volver  verdadero ;
		if (o ==  null  || getClass () ! = o . getClass ())
			devuelve  falso ;

		CadenaDeBloques cadena = ( CadenaDeBloques ) o;

		if (bloques . size () ! = cadena . getBloques () . size ())
			devuelve  falso ;

		for ( int i =  0 ; i < bloques . size (); i ++ ) {
			if (bloques . get (i) ! = cadena . getBloques () . get (i))
				devuelve  falso ;
		}

		volver  verdadero ;
	}

	@Anular
	public  String  toString () {
		devolver bloques . Encadenar();
	}
}
