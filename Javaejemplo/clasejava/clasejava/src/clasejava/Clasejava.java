/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasejava;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author erach
 */
public class Clasejava {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<empresa> arrEmpresa = new ArrayList<>();        
        Scanner scanner=new Scanner(System.in);
        Boolean estadoMenu=true;
        
        while (estadoMenu)
        {
            //int opcMenu=0;
            
            System.out.println("* Menu de Opciones *\n\n");
            System.out.println("1 Agregar Vehiculo");
            System.out.println("2 Lista Vehiculos");
            System.out.println("3 Agregar Empresa");
            System.out.println("4 Lista Empresas");
            System.out.println("5 Salir ");
            System.out.print("Digite la opcion Correspondiente (1-5): ");
            
            int opcMenu=scanner.nextInt();
            if(opcMenu==1)
            {
                Scanner entrada = new Scanner(System.in);
                entrada.useLocale(Locale.US);
                //ArrayList<Vehiculo> vehiculos = new ArrayList<>();
                String marca;
                String modelo;
                int year;
                boolean bandera = true;
                String salida;
                while (bandera) 
                {
                    System.out.println("Ingrese la marca del vehículo: ");
                    marca = entrada.nextLine();
                    System.out.println("Ingrese el modelo del vehículo: ");
                    modelo = entrada.nextLine();
                    System.out.println("Ingrese el año del vehículo: ");
                    year = entrada.nextInt();
                    entrada.nextLine();
                    Vehiculo vehiculo = new Vehiculo(marca, modelo, year);
                    vehiculos.add(vehiculo);
                    System.out.println("¿Desea salir del ciclo? Escriba 'y' para salir.");
                    salida = entrada.nextLine();
                 
                    
                    if (salida.equals("y")) 
                    {
                        bandera = false;
                    }
                }
            }
            if(opcMenu==2)
            {
                System.out.println("Listado de Vehículos");
                for (int i = 0; i < vehiculos.size(); i++) 
                {
                    System.out.println(vehiculos.get(i));
                }                        
            }
            if(opcMenu==3)
            {
              
                String varNombre;
                String varDireccion;
                String varIdentificacionFiscal;
                String varSectorActividad;
                int varEmpleados;
                double varIngresosAnuales;
                String varSitioWeb;
                String varContactoPrincipal;
                String varNumeroTelefono;
                
                String salida;
               
                Scanner escribir = new Scanner(System.in);
                escribir.useLocale(Locale.US);

                boolean banderaE = true;
                while (banderaE) 
                {
                    System.out.println("Ingrese el nombre de la empresa: ");
                    varNombre = escribir.nextLine();
                    System.out.println("Ingrese el Direccion de la empresa: ");
                    varDireccion = escribir.nextLine();
                    System.out.println("Ingrese el Identificacion Fiscal: ");
                    varIdentificacionFiscal = escribir.nextLine();  
                    System.out.println("Ingrese el Sector Actividad: ");
                    varSectorActividad = escribir.nextLine(); 
                    System.out.println("Ingrese la Cantidad de empleados: ");
                    varEmpleados = escribir.nextInt();
                    System.out.println("Ingrese el valor de Ingresos Anuales: ");
                    varIngresosAnuales = escribir.nextDouble();
                    System.out.println("Ingrese el sitio web: ");
                    varSitioWeb = escribir.nextLine();
                    System.out.println("Ingrese el Contacto Principal: ");
                    varContactoPrincipal = escribir.nextLine();
                    System.out.println("Ingrese el Numero de Telefono: ");
                    varNumeroTelefono = escribir.nextLine();
                    escribir.nextLine();
                    empresa nvaEmpresa=new  empresa(varNombre,varDireccion,varIdentificacionFiscal,varSectorActividad,varEmpleados,varIngresosAnuales,varSitioWeb,varContactoPrincipal,varNumeroTelefono);
                    arrEmpresa.add(nvaEmpresa);
                    System.out.println("¿Desea salir del ciclo? Escriba 'y' para salir.");
                    salida = escribir.nextLine();
                            
                    if (salida.equals("y")) 
                    {
                        banderaE = false;
                    }                    
                }                                
            }
            
            if(opcMenu==4)
            {
                System.out.println("Listado de Empresas\n\n");
                for (int i = 0; i < arrEmpresa.size(); i++) 
                {
                    System.out.println(arrEmpresa.get(i));
                }                   
            }
            
            
            if(opcMenu==5)
                estadoMenu=false;
            
        }
        
    }    
    
}
