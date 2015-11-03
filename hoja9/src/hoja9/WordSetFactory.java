/*
	Universidad del Valle de Guatemala
	Santiago Sol�rzano	14629
	Pablo Barreno Koch  14
	Adriano Batlle      14
	Hoja 9
*/
class WordSetFactory {
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = implementado con Red black tree
	//                         3 = implementado con Splay Tree
	//                         4 = implementado con Hash Table
	//                         5 = implementado con TreeMap (de Java Collection Framework)
	
	public static WordSet generateSet(int tipo)
	{
	    if (tipo == 1)
		    return new SimpleSet();
		else
		    // aqui se regresara el set empleando sus implementaciones:
			// if tipo == 2 cree una instancia para un Wordset implementao con Red Black Tree
			// if tipo == 3 cree una instancia para un Wordset implementado con Splay Tree
			// if tipo == 4 cree una instancia para un Wordset implementado con Hash table
			// if tipo == 5 cree una instancia para un Wordset implementado con TreeMap
			
			return new null; // modificarlo para que regrese la implementacion seleccionada
	}
	
	
}