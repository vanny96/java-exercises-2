package com.vanny96;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        Competition competition = new Competition(reader);

        System.out.println( "Kumpula ski jumping week\n" );

        competition.addJumpers();

        System.out.println("\nThe tournament begins!");
        
        competition.play();
    }
}
