/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edwin.impresiones;

/**
 *
 * @author Usuario
 */
public class Clsimpresiones {
    public static String[][] ma = new String [8][8];
    public static String[][] mas = new String [30][10];
    
    
    
    
    
    public static void impresionX(){
        cargaMatriz();
        columnasx();
        imprimeDecorado();
    }
    public static void imprimeLWhile(){ 
        cargaMatriz();  
        int y=0;
        int a=0;
        int b=0;
        while (a < ma.length && b ==0)
        {       
            System.out.println(ma[y][b]);        
            a++;            
            if (a==7){
                for (int i=0; i<ma.length;i++){
                  System.out.print(ma[y][i]);  
                }               
                b=1;               
            }          
            y++;
        }       
        System.out.println("");
    }
    public static void columnasL(){
        datos();
        int columna = ma.length;
        try {
        for (int f=0; f<ma.length;f++){
            ma[f][columna-1]= "/";
            ma[f-f][f]= "/";
            ma[f][f-f]="x";
            ma[columna-1][f]= "x";
        }
        }catch(Exception e){
            System.out.println("direccion index bound" + columna);
        }
        impresion();
        
    } 
    
    
    
    
    public static void columnaspares(){
         for ( int f=0; f<mas.length; f++){
             for ( int c=0; c<mas.length; c++){
                 if ( c%2==0){
                     mas[f][c]="p";
                 } 
             }
         }
         
     }
    public static void matriz(){
        cargaMatriz2();
        columnaspares();
        impresion2();
        
    }  
    public static void datos(){
     for (int c=0;c<ma.length;c++ ){
     for (int f=0;f<ma.length;f++ ){
         ma[f][c]="";         
             }   
         }
        
    }
    public static void impresion(){
        for (int x=0;x<ma.length;x++ ){
             for (int y=0;y<ma[x].length;y++ ){
                 System.out.print(ma[x][y]);
                    if( y != ma[x].length-1 ){//asi da la longitud de la columna y ma.length la longitud de filas
                           System.out.print("\t");                       
                }
             }   
             System.out.println("");
         }
    }   
    public static void impresion2(){
        for (int x=0;x<mas.length;x++ ){
             for (int y=0;y<mas[x].length;y++ ){
                 System.out.print(mas[x][y]);
                    if( y != mas[x].length-1 ){//asi da la longitud de la columna y ma.length la longitud de filas
                           System.out.print("\t");                       
                }
             }   
             System.out.println("");
         }
    }   
    public static void cargaMatriz(){
    for (int c=0;c<ma.length;c++ ){
     for (int f=0;f<ma.length;f++ ){
         ma[f][c]="x";         
             }   
         }
    } 
    public static void cargaMatriz2(){
    for (int c=0;c<mas.length;c++ ){
     for (int f=0;f<mas.length;f++ ){
         mas[f][c]="x";         
             }   
         }
    } 
    public static void columnasx(){
        int columnas=0;
        try {
        for (int f=0; f<ma.length;f++){
            ma[f][f]= "\\";
            columnas = ma.length-1-f;
            ma[f][columnas]= "/";
        }
        }catch(Exception e){
            System.out.println("direccion index bound" + columnas);
        }
        
        
    } 
    public static void imprimeDecorado(){
        for (int x=0;x<ma.length;x++ ){
            System.out.print("|");
             for (int y=0;y<ma[x].length;y++ ){
                 System.out.print(ma[x][y]);
                    if( y != ma[x].length-1 ){//asi da la longitud de la columna y ma.length la longitud de filas
                           System.out.print("\t");                       
                }
             }   
             System.out.println("|");
         }
    }
    
    
}
