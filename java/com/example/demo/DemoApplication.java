package com.example.demo;

import com.example.demo.algorithm.controller.AlgorithmController;
import com.example.demo.phone.controller.PhoneController;
import com.example.demo.quiz.controller.Feb07Controller;
import com.example.demo.quiz.controller.QuizController;
import com.example.demo.member.controller.MemberController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		PhoneController phoneController = new PhoneController();
		QuizController quizController = new QuizController();
		MemberController memberController = new MemberController();
		AlgorithmController algorithmController = new AlgorithmController();


		while (true){
			System.out.println("1.Exit 2.Auth 3.OOP 4.Quiz 5.Algorithm");
			switch (scanner.next()){
				case "0":
					System.out.println("### Exit ###");return;
				case "1":
					System.out.println("### Auth ###");
					memberController.execute(scanner);break;
				case "2":
					System.out.println("### OOP ###");
					phoneController.execute(scanner);break;
				case "3":
					System.out.println("### Quiz ###");
					quizController.execute(scanner);break;
				case "4":
					System.out.println("### Algorithm ###");
					algorithmController.execute(scanner);break;
				default:
					System.out.println("Wrong Number");
			}
		}


	}

}
