/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.deber_poo_coraisaca_astudillo_gp02;

/**
 *
 * @author usuario
 */
public class Empleado {
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int anioIngreso;
    
    public double calcularIngreso(int anioActual){
        
        var sueldo = 10000d;
        var edadEmpleado = 10000d;
        var multiplicacion = 10000d;
        var multiplicacion2 = 10000d;
        var suma = 10000d;
        
            sueldo = horasTrabajadas * costoHora;
            edadEmpleado = anioActual - anioIngreso;
            multiplicacion = sueldo * 0.02; 
            multiplicacion2 = edadEmpleado * multiplicacion;
            suma = sueldo + multiplicacion2;
            
        return suma;
    }
    
    public double calcularHoraBonusExtra(int maximoHorasTrabajadas){
        
        var retorno = 10000d;
        var multiplicacion = 10000d;
        
        if(this.horasTrabajadas >= 0 && this.horasTrabajadas <= 150);
            retorno =(this.horasTrabajadas - maximoHorasTrabajadas);
            multiplicacion = (this.costoHora * retorno);
            
            
        
            
        return multiplicacion;
    }
    
    
            public double calcularImpuestos(int limit1, int limit2, int limit3 ){
            
         var retorno=10000d;
        if(this.costoHora*horasTrabajadas >= 0 && this.costoHora*horasTrabajadas <= limit1){
            if(this.costoHora*horasTrabajadas >= limit1 && this.costoHora*horasTrabajadas<= limit2)
                retorno=this.costoHora*horasTrabajadas*0.05;
            else
                retorno=this.costoHora*horasTrabajadas*0.12;
        }else{
             if(this.costoHora*horasTrabajadas>=limit2 && this.costoHora*horasTrabajadas<=limit3)
                retorno=this.costoHora*horasTrabajadas*0.25;
        }
        return retorno;
   }
    
    
}
