/*package piglatin;*/

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileReader;


public class ConsoleUI {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_CYAN = "\u001B[36m";

    public boolean authors_flag = false;
    public boolean help_flag = false;

	public void processArgs(String[] args) {    	

        for (int i=0;i<args.length;i++) {
            
            if ( args[i].equals("--authors") || args[i].equals("-a") ){

                authors_flag= true;
                return;

            }

            if ( args[i].equals("--help") || args[i].equals("-h") ){

                help_flag = true;
                return;

            }


        }
       

    }

    public static void printHelpInfo(){

        System.out.println("This is program that converts English sentences into Pig Latin.");
        System.out.println("Pig Lartin is a secret language formed from English by transferring the initial consonant or consonant cluster of each word to the end of the word and adding a vocalic syllable.");
        
    }

    public static void printAuthorsInfo(){

        System.out.println(ANSI_CYAN + "Made by:" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "TT" + ANSI_RESET);
        System.out.println(ANSI_RED + "IB" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "AR" + ANSI_RESET);
        System.out.println("2017");

    }




    	
}
