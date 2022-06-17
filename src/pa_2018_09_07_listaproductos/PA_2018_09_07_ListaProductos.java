/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2018_09_07_listaproductos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aa501
 */
public class PA_2018_09_07_ListaProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¿cuantos productos?: ");
        int n = teclado.nextInt();
        
        //creamos un arreglo de refererncias a n productos
        Producto [] lista = new Producto[n];
        
        //creamos los objetos del arreglo 
        int i;
        for (i=0; i<lista.length; i++)
            lista[i] = new Producto();
        
        
        //mostramos la lista de prodcutos
        System.out.println("\nlista inicial de productos\n");
        for (i=0; i<lista.length; i++)
            System.out.println(lista[i]);
        
        int[] imp = {0,6, 10, 20};
        
        //asignamos valores a los atributos de los objetos
        Random azar = new Random();
        
        String [] desc = {"camisa","pantalon","tenis","zapatos","playera",
                          "celular","tablet","reloj","lentes","saco"};
        
        for (i=0; i<lista.length; i++)
        {
            lista[i].setDescripcion(desc[azar.nextInt(desc.length)]);
            lista[i].setCosto(500+azar.nextInt(1500));
            lista[i].setMargenUtilidad(10+azar.nextInt(20));
            lista[i].setPorcentajeDescuento(azar.nextInt(20));
            lista[i].setPorcentajeImpuesto(imp[azar.nextInt(imp.length)]);
            
             //mostramos la lista de prodcutos
        System.out.println("\nlista inicial de productos\n");
        for (i=0; i<lista.length; i++) 
            System.out.println(lista[i]);
        
         //mostramos la lista de precios
        System.out.println("\nlista inicial de precios\n");
        for (i=0; i<lista.length; i++)
            System.out.println(lista[i].getDescripcion()+" $"+lista[i].precio());
        
        //ordenamos el arreglo
        //Arrays.sort(); no puede hacer un ordenador de objetos(de momento)
        //Arrays.sort(lista);
        
        //ordenamos por el metodo de la burbuja
        for (i=0; i<lista.length-1; i++)
            for(int j=i+1; j<lista.length; j++)
                if (lista[i].precio()>lista[j].precio())
                {
                    Producto aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
        
        
         //lista ordenadad de precios
        System.out.println("\nlista inicial de precios\n");
        for (i=0; i<lista.length; i++)
            System.out.println(lista[i].getDescripcion()+" $"+lista[i].precio());
        
        }
                               
    }//fin main:)
    
}
