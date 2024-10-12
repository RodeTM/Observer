/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;

public class Observer {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();

        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");

        sujeto.agregarObservador(cliente1);
        sujeto.agregarObservador(cliente2);

        sujeto.notificar("El precio de la acción ha subido");
    }
}
