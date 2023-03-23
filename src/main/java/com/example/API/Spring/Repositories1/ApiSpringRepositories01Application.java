package com.example.API.Spring.Repositories1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiSpringRepositories01Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringRepositories01Application.class, args);
	}

	/*
		scrivere un'applicazione Spring Boot con le dipendenze necessarie che:
	utilizzaRest Repositories HAL Explorer
	si connette a un db MySQL locale
	rilascia lo schema alla fine della sessione
	definisce una tabella di auto, in cui ciascuna Car ha:
	una chiave primaria
	un modelName non nullo
	un serialNumber non nullo
	a currentPriceche può essere nullo
	definisce un repository per le auto, in modo che sia possibile utilizzarlo HAL Explorerper esplorare i dati
	usa il HAL Explorerper aggiungere 2 auto nel database
	usa il HAL Explorerper elencare tutte le auto nel database
	 */



}
