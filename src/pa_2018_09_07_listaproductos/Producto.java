/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2018_09_07_listaproductos;

/**
 *
 * @author aa509
 */
public class Producto {
    
    //atributos
    private String descripcion;
    private double costo;
    private double margenUt;
    private double porcDesc;
    private double porcImp;
    
    //constructores
    public Producto()
    {
        descripcion = "No-Id";
        costo =0;
        margenUt =0;
        porcDesc =0;
        porcImp =0;
    }
    public Producto(String desc, double cto, double margUt, double porcDes, double porcIm)
    {
        descripcion = desc;
        costo = cto;
        margenUt = margUt;
        porcDesc = porcDes;
        porcImp = porcIm;
    }
    //metodos get/set
    public String getDescripcion()
    {
        return descripcion;
    }
    
    public double getCosto()
    {
        return costo;
    }
    
    public double getMargenUtilidad()
    {
        return margenUt;
    }
    
    public double getPorcentajeDescuento()
    {
        return porcDesc;
    }
    
    public double getPorcentajeImpuesto()
    {
        return porcImp;
    }
    
    public void setDescripcion(String desc)
    {
        descripcion= desc;
    }
    public void setCosto(double cos)
    {
        costo= cos;
    }
    public void setMargenUtilidad(double margUt)
    {
        margenUt= margUt;
    }
    public void setPorcentajeDescuento(double porcDes)
    {
        porcDesc= porcDes;
    }
    public void setPorcentajeImpuesto(double porcIm)
    {
        porcImp= porcIm;
    }
    
    public String toString()
    {
        return descripcion +"Costo: "+costo+
                            " %Util: "+margenUt+
                            " %Dcto: "+porcDesc+
                            " %Imp: "+porcImp;
    }
  
    //metodod e calculo o proceso
    public double importeUtilidad()
    {
        return costo * margenUt / 100;
    }
    public double importeDescuento()
    {
        return (costo + importeUtilidad())* porcDesc / 100;
    }
    public double importeImpuesto()
    {
        return (costo + importeUtilidad() - importeDescuento())* porcImp / 100;
    }
    
    public double precio()
    {
//        double impUti = costo * margenUt / 100;
//        double subtotal1 =costo + impUti;
//        double impDesc = subtotal1 * porcDesc / 100;
//        double subTotal2 = subtotal1 - impDesc;
//        double impImp = subTotal2 * porcImp / 100;
//        double total = subTotal2 + impImp;
//        
//        return total;
         return costo + importeUtilidad() - importeDescuento() + importeImpuesto();
        
    }
}
