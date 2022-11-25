package com.minitinder.miniTinder;

import com.minitinder.miniTinder.services.OperationService;
import com.minitinder.miniTinder.services.impl.OperationServiceImpl;
import org.springframework.boot.SpringApplication;

import java.util.Scanner;

public class MiniTinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniTinderApplication.class, args);

		Scanner scn = new Scanner(System.in);
		OperationService operationService = new OperationServiceImpl();

		System.out.println("\n---------MiniTINDER-----------");

		    while (true)  {
			System.out.println("\n1. Создать аккаунт \n2. Войти \n");
			System.out.print("Ответ: ");
			int choose = scn.nextInt();

			while (!(choose == 1 | choose == 2)){
				System.out.print("\nВыберите правильную команду!\nОтвет: ");
				choose = scn.nextInt();
			}

			switch (choose) {
				case 1:
					operationService.registration();
					break;
				case 2:
					operationService.autorisation();
					break;
			}
		}
	}

}



