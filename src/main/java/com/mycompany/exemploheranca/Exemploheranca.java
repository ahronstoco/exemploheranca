package com.mycompany.exemploheranca;

public class Exemploheranca {
 public static void main(String[] args) {
  Triangulo triangulo = new Triangulo();
  triangulo.leitura();
  System.out.println("area do triângulo:" + triangulo.getArea()); 
  Circulo circulo = new Circulo("Azul",3);
  System.out.println(circulo.paraString());
  System.out.println("area do círculo:" + circulo.getArea());
 }
 }