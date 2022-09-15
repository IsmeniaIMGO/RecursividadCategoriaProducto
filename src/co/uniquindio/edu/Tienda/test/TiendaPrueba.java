package co.uniquindio.edu.Tienda.test;
import java.util.ArrayList;


import co.uniquindio.edu.Tienda.model.*;

public class TiendaPrueba {

	public static void main(String[] args) {
		//crear lista vacia para punto1 precio
		ArrayList<Producto> listaProductoPrecio = new ArrayList<Producto>();
		
		//crear lista vacia para punto2 color
		ArrayList<Producto> listaProductosColor = new ArrayList<Producto>();
		//_________________________________________________________________________________________________________________________
		//crear listaCategorias para la tienda
		ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();
		
		//crear la tienda
		Tienda tienda = new Tienda("tienda1", listaCategorias);
		//_____________________________________________________________________________________________________________________
		//crear listaProductos y ListaSubCategorias para Categoria: Tecnologia
		ArrayList<Producto> listaProductos1 = new ArrayList<Producto>();
		ArrayList<Categoria> subCategoria1 = new ArrayList<Categoria>();
		
		//crear categoria para listaCategorias en Tienda
		Categoria tecnologia = new Categoria("Tecnologia", listaProductos1, subCategoria1);
		
		//____________________________________________________________________________________________________________
		
		//crear producto para listaProductos1 en Categoria: Tecnologia
		Producto televisor = new Producto("Televisor", 12000 , "negro");
		Producto impresora = new Producto("Impresora", 1000, "rojo");
		
		//crear listaProductos2 y subCategoria2 para Categoria: Computadores de listaSubcategoria1 
		ArrayList<Producto> listaProductos2 = new ArrayList<Producto>();
		ArrayList<Categoria> subCategoria2 = new ArrayList<Categoria>();
		
		//crear categoria para listaSubcategoria1 en Categoria: Tecnologia
		Categoria computadores = new Categoria("Computadores", listaProductos2, subCategoria2);
		
		//crear producto para listaProductos2 en Categoria: Computadores
		Producto asus = new Producto("Asus", 9000, "rojo");
		Producto acer = new Producto("Acer", 13000, "negro");
		
		//crear listaProductos3 y subCategoria3 para Categoria: Camaras de listaSubcategoria2 
		ArrayList<Producto> listaProductos3 = new ArrayList<Producto>();
		
		//crear categoria para listaSubcategoria2 en categoria: computadores
		Categoria camaras = new Categoria("Camaras", listaProductos3);
		
		//crear producto para listaPorductos3 en categoria: camaras
		Producto camara1 = new Producto("Camara reflexiva", 11100, "rojo");
		Producto camara2 = new Producto("Camara digital", 15000, "rojo");
		
		

		
		listaCategorias.add(tecnologia);	
		
		//Categoria: Tecnologia
		listaProductos1.add(televisor);
		listaProductos1.add(impresora);
		
		subCategoria1.add(computadores);
		
		//Categoria: Computadores
		listaProductos2.add(asus);
		listaProductos2.add(acer);
		
		subCategoria2.add(camaras);
		
		//Categoria: Camaras
		listaProductos3.add(camara1);
		listaProductos3.add(camara2);
		
		//llamar metod que pide los productos con valor mayor a 10.000
		tienda.buscarPrecio(0, listaProductoPrecio);
		System.out.println("PUNTO1: "+listaProductoPrecio +"\n");
			
		
		//llamar metod que pide los productos con color igual a rojo
		tienda.verificarColor(0, listaProductosColor);	
		System.out.println("PUNTO 2: "+listaProductosColor);
		
		if (listaProductosColor.contains(impresora)) {
			System.out.println("\n"+"existen");
		}else {
			System.out.println("\n"+"no existen");
		}
		
		}
		
		//OBSERVACION: NO SE POR QUE NO ENTRA A LA ULTIMA CATEGORIA.

}
