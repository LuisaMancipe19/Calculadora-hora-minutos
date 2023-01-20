/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horasyminutos;

import java.util.Scanner;

/**
 *
 * @author Auxfacturacion
 */
public class HorasyMinutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int segundosFacilitado;
           
            int minutos;
            int segundosFinal;
            int horasFinal;
            int horas;
            int dias;
            Scanner sca = new Scanner(System.in);
            System.out.println("Dime una cantidad en segundos");
            segundosFacilitado = sca.nextInt();
            if (segundosFacilitado <= 0) {
                throw new Exception("Debes poner una cantidad válida");
            }
            dias = segundosFacilitado / 86400;
            int diasFinal = segundosFacilitado % 86400;
            horas = diasFinal / 3600;
            horasFinal = diasFinal % 3600;
            minutos = horasFinal / 60;
            segundosFinal = horasFinal % 60;
            //System.out.println("Son", + dias, "+  días", + horas, "+  horas", + minutos, "+ minutos ", + segundosFinal, "+ segundosFinal");
        } catch (Exception ex) {
            System.out.println("Error a la hora de introducir el código cod:" + ex.getMessage());
        }
    }
    
}
