package com.generation; // Como tan nos explico es un piedra, papel o tijeras con errores, abajo pongo los que encontre

import java.util.Scanner;  //Añadi el import para la clase Scanner

public class Codigo4 {

  public static void main(String[] args) { // Añadi el main method para hacerlo ejecutable
    
    Scanner s = new Scanner(System.in); // Añadi System.in a el constructor Scanner para leer el imput de la consola 
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // lo cambie a  "jugador 2"
    Scanner s2 = new Scanner(System.in); // Cree el objeto new Scanner para el segundo input.
    String j2 = s2.nextLine(); // Cambie el leer input a s2 en lugar de s
    
    if (j1.equals(j2)) { // Lo cambie para usar el mismo metodo para la comparasion de strings.
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) { // Lo cambie para usar el mismo metodo para la comparasion de strings.
            g = 1;
          }
          break; // Añadi el break para salir del switch cuando el caso matche 
        
        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
          }
          break;
          
        case "tijeras": // Le corregi y puse "tijeras" por que tenia tijera en la linea 24 y asi no iba a agarrar 
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
          
        default:
          break; // Añadi el default case para los inputs invalidos.
      }
      System.out.println("Gana el jugador " + g);
    }
  }
}
