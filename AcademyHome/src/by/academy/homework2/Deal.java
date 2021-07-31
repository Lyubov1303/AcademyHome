package by.academy.homework2;

import java.util.Scanner;

public class Deal {
	public static void main(String[] args) {
		
		int cardsPerPlayer = 5;
		int players =0 ;
		String[] suits = {"Пик", "Бубен", "Черв", "Треф"};
	    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};
	    int n = suits.length * rank.length;
	    
	    System.out.println("Введите количество игроков: ");
	    Scanner sc = new Scanner(System.in);
	    players = sc.nextInt();
	    
	    
	    while (players < 2 || players > n/5) {
	    	System.out.println("Количество игроков не соответствует правилам игры");
	    	System.out.println("Введите количество игроков: ");
	    	players = sc.nextInt();
		        }
	    System.out.println("\t");
	    System.out.println("Начнем игру!");
	    System.out.println("\t");
	    
	    
	    String[] deck = new String[n];
	    
	    for (int i = 0; i < rank.length; i++) {
	    	for (int j = 0; j < suits.length; j++) {
	    		deck[suits.length*i + j] = rank[i] + " " + suits[j];
	    		}
	    	}
	    
	    for (int i = 0; i < n; i++) {
	    	int r = i + (int) (Math.random() * (n-i));
	    	String temp = deck[r];
	    	deck[r] = deck[i];
	    	deck[i] = temp;
	    	}
	 	
	    for (int i = 0; i < players * cardsPerPlayer; i++) {
				System.out.println(deck[i]);
				if (i % cardsPerPlayer == cardsPerPlayer - 1)
					System.out.println();
			}
			sc.close();
		}
	 
	}