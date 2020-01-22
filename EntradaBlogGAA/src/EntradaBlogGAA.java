/**
 * Clase para manejar las entradas de un blog.
 * @author Germán Asencio
 * @version 1.0
 * @since 22/01/2020
 */
public class EntradaBlogGAA {

	/** 
	 * Carácter del separador que separa ENTRADA DE del nombre del autor.
	 */
	public static char separador=':';
	/**
	 * Número identificador de la entrada.
	 */
	private int id;
	/**
	 * Texto de la entrada.
	 */
	private String texto;
	/**
	 * Nombre del autor de la entrada.
	 */
	private String autor;
	
	/**
	 * Constructor de la clase que crea una entrada en el blog.
	 * @param id int Número de entrada
	 * @param autor String Nombre del autor
	 * @param texto String Texto de la entrada
	 * @throws IllegalArgumentException Se lanza cuando el número de entrada es negativo
	 */
	//
	public EntradaBlogGAA(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * Se devuelve el identificador de la entrada del blog.
	 * @return Número de la entrada del blog.
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * Se devuelve el texto completo de la entrada del blog.
	 * @return Texto de la entrada del blog.
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * Se devuelve el nombre del autor de la entrada en mayúsculas.
	 * @return Nombre del autor en mayúsculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * Se devuelve el nombre del autor de la entrada.
	 * @return Nombre del autor
	 * @deprecated Obsoleto, sustituido por {@link #getAutor()}
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * Método en donde empieza el programa. Se crea un objeto EntradaBlogGAA y posteriormente se imprime el texto de la entrada creada.
	 * @param args Array de valores String que recibe el método al inicio. Son opcionales.
	 */
	//No tiene porqué tener argumentos.
	public static void main(String[] args) {
		EntradaBlogGAA e1=new EntradaBlogGAA (1,"Germán","Código arreglado");
		System.out.println(e1);
	}
}