/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoaheranca;

/**
 *
 * @author rafaelamoreira
 */
public class Professor extends Pessoa {
    
    private double salario;
    private String titulo;

    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salario: " + salario + ", Titulo: " + titulo;
    }
}
