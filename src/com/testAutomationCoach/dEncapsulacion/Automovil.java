package com.testAutomationCoach.dEncapsulacion;

import libs.Input;

public class Automovil {
	//Atributos
	
	private String marca;
	private double velocidadActual;
	private double maximaVelocidad;
	private String tipoDeTransmision;
	private int numDePuertas;
	private int numDeLlantas;

	private int numRevoluciones;
	private double litrosGas;
	private double temperatura;


	Automovil() {
		marca = "Ford";
		velocidadActual = 0.0;
		maximaVelocidad = 200.0;
		tipoDeTransmision = "Manual";
		numDePuertas = 2;
		numDeLlantas = 4;
		numRevoluciones = 0;
		temperatura = 0.0;
		litrosGas = 15;
	}



	Automovil(String marca, double maximaVel, String tipoTransmision, int numPuertas, int numLlantas) {
		this.marca = marca;
		this.velocidadActual = 0.0;
		this.maximaVelocidad = maximaVel;
		this.tipoDeTransmision = tipoTransmision;
		this.numDePuertas = numPuertas;
		this.numDeLlantas = numLlantas;
		numRevoluciones = 0;
		temperatura = 0.0;
		litrosGas = 15;
	}
	//comportamiento

	public void encender(){

	}

	public void apagar(){

	}

	public void acelerar() {
		if (numRevoluciones == 0.0){
			System.out.println("El automovil está apagado");
		} else {
			Input.print("run run\n");
			this.velocidadActual += 5.0;
		}
		Input.print("run run\n");
		this.velocidadActual += 5.0;
		this.litrosGas = litrosGas - 0.01;
		this.numRevoluciones += 50;
		this. numRevoluciones = numRevoluciones + 100;
		this.temperatura += 20;
	}
	
	public void frenar() {
		Input.print("Screeeeech!\n");
		this.velocidadActual = 0;
		this. numRevoluciones = 0;
		this.temperatura -= 5;
	}
	
	public void retroceder() {
		Input.print("piii piii piii piii\n");
		this.velocidadActual -= 5;
		this.litrosGas = litrosGas - 0.005;
		this. numRevoluciones = numRevoluciones + 50;
		this.temperatura += 10;

	}

	public int getNumRevoluciones() {
		return numRevoluciones;
	}

	public double getLitrosGas() {
		return litrosGas;
	}

	public double getTemperatura() {
		return temperatura;
	}
	
	public double getVelocidad() {
		return velocidadActual;
		
	}
}
