/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author gabriel.07907
 */
    public class Televisao extends Produto{
        private Double Polegada;
        
        public Televisao(){
        }
        
        public double getPolegada(){
            return Polegada;
        }
        
        public void setPolegada(Double Polegada) {
            this.Polegada = Polegada;
            
        }
        @Override
        
        public String toString(){
            return  "Nome: " + super.getNome() + 
                " | Preço: " + super.getPreco() +
                " | Polegada: " + this.Polegada;
        }              
    }  
