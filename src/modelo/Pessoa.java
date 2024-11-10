/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.DecimalFormat;

/**
 *
 * @author vanessalagomachado
 */
public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    
    public Pessoa(String n){
        nome = n;
    }
    public Pessoa(String n, double peso, double altura){
        nome = n;
        this.peso = peso;
        this.altura = altura;
    }
    
    // getter
    public String getNome(){
        return this.nome;
    }
    public double getPeso(){
        return peso;
    }
    public double getAltura(){
        return altura;
    }
    
    // setter
    public void setPeso(double p){
        peso = p;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getIMC(){
        // return peso / (altura *altura);
        return peso / Math.pow(altura, 2);
    }
    
    
    public String getInformacoes(){
//        DecimalFormat formato
        String aux = "Pessoa Cadastrada:\n";
        if (nome != null)
            aux += "Nome: "+nome;
        if(peso != 0)
            aux+= "\nPeso: "+peso;
        if(altura != 0)
            aux += "\nAltura: "+altura;
        if (peso != 0 && altura != 0)
            aux += "\nIMC: "+String.format("%.2f", getIMC());
        return aux;
    }

    @Override
    public String toString() {
        return nome;
    }

   

    
    
    
    
}
