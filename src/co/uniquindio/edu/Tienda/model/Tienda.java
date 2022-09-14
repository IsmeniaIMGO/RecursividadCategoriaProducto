package co.uniquindio.edu.Tienda.model;

import java.util.ArrayList;

import co.uniquindio.edu.Tienda.model.*;
public class Tienda {
	private String nombre;
	private ArrayList<Categoria> listaCategorias;
	
	/**
	 * Contructor
	 * @param nombre
	 * @param categoria
	 */
	public Tienda(String nombre, ArrayList<Categoria> categoria) {
		super();
		this.nombre = nombre;
		listaCategorias = categoria;
	}

	/**
	 * metodos set y get
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Categoria> getListaCategorias() {
		return listaCategorias;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}


	/**
	 * metodo toString
	 */
	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", Categoria=" + listaCategorias + "]";
	}

	/**
	 * Metodo que retorna los productos con un precio mayor a 10000
	 * @param i
	 * @param listaProductosPrecio
	 * @return listaProductosPrecio
	 */
	public ArrayList<Producto> buscarPrecio(int i, ArrayList<Producto> listaProductosPrecio){
		//caso base
		if (i == listaCategorias.size()){	
			return listaProductosPrecio;
		}
		//caso recursivo
		else {	
			listaCategorias.get(i).buscarPrecio(i,listaProductosPrecio);	
			buscarPrecio(i+1, listaProductosPrecio);	
			
		}		
		return listaProductosPrecio;
					
	}

	/**
	 * Metodo que retorna los productos de color: rojo
	 * @param i
	 * @param listaProductosColor
	 * @return listaProductosColor
	 */
	public  ArrayList<Producto> verificarColor(int i, ArrayList<Producto> listaProductosColor){
		//caso base
		if (i == listaCategorias.size()){	
			return listaProductosColor;
		}
		//caso recursivo
		else {	
			listaCategorias.get(i).verificarColor(i, listaProductosColor);	
			verificarColor(i+1, listaProductosColor);		
		}
		return listaProductosColor;
	}
	
	
	
}
