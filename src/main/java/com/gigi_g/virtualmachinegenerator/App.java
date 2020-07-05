package com.gigi_g.virtualmachinegenerator;

import com.gigi_g.virtualmachinegenerator.system.Generate;

public class App {

    public static void main(String[] args) {
        printTitle();
        Generate generate = new Generate();
        generate.init();
        generate.generateMachine();
    }

    private static void printTitle() {
        System.out.println( 
        "__      ____  __  _____                           _             \n"+
        "\\ \\    / /  \\/  |/ ____|                         | |            \n"+
         " \\ \\  / /| \\  / | |  __  ___ _ __   ___ _ __ __ _| |_ ___  _ __ \n"+
          "  \\ \\/ / | |\\/| | | |_ |/ _ \\ '_ \\ / _ \\ '__/ _` | __/ _ \\| '__|\n"+
           "   \\  /  | |  | | |__| |  __/ | | |  __/ | | (_| | || (_) | |   \n"+
            "    \\/   |_|  |_|\\_____|\\___|_| |_|\\___|_|  \\__,_|\\__\\___/|_|\n");
    }
}