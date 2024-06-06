/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que maneja las transacciones relacionadas con las cuentas bancarias.
 */
public class Transaccion {

    final String rutaArchivo = "transacciones.txt";
    List<String> lineas;
/**
     * Constructor que inicializa la lista de líneas leyendo el archivo de transacciones.
     */

    public Transaccion() {
        lineas = leerArchivo(rutaArchivo);
    }
    
/**
     * Lee las líneas del archivo especificado.
     *
     * @param rutaArchivo La ruta del archivo a leer.
     * @return Una lista de cadenas, cada una representando una línea del archivo.
     */
  
    public List<String> leerArchivo(String rutaArchivo) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return lineas;
    }

     /**
     * Crea una nueva transacción y la guarda en el archivo de transacciones.
     *
     * @param nCuenta El número de cuenta origen.
     * @param tipoTransaccion El tipo de transacción (e.g., "Depósito", "Retiro").
     * @param monto El monto de la transacción.
     * @param divisa La divisa de la transacción.
     * @param nCuentaR El número de cuenta de destino.
     */
    
    public void crearTransaccion(String nCuenta, String tipoTransaccion, double monto, String divisa, String nCuentaR) {
        if(tipoTransaccion.equals("Transfirio")){
            Cuentas c = new Cuentas();
            divisa = c.tipoCuenta(nCuentaR);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            writer.write("Desde: "+nCuenta + "," + tipoTransaccion + "," + monto + divisa + ", A: " + nCuentaR + "\n");
            writer.write("A: "+nCuentaR + "," + "Te " +tipoTransaccion + "," + monto+ " " + divisa + ", Desde: " + nCuenta + "\n");
            System.out.println("Datos agregados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
        }else{
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            writer.write("Desde: "+nCuenta + "," + tipoTransaccion + "," + monto + divisa + ", A: " + nCuentaR + "\n");
            System.out.println("Datos agregados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
        }
    }

    /**
     * Lee las transacciones asociadas a una cuenta específica.
     *
     * @param nCuenta El número de cuenta para el que se quieren obtener las transacciones.
     * @return Un objeto StringBuilder que contiene todas las transacciones relacionadas con la cuenta.
     */
    
    public StringBuilder leerTransaccionCuenta(String nCuenta) {
        StringBuilder transacciones = new StringBuilder();
        for (String linea : lineas) {
            String[] partes = linea.split(",");
            String emisor = partes[0];
            if (emisor.equals("Desde: "+nCuenta)|| emisor.equals("A: "+nCuenta)) {
                // Construir la cadena de transacciones concatenando cada línea
                transacciones.append(linea).append("\n");
            }
        }
        return transacciones;
    }
}
