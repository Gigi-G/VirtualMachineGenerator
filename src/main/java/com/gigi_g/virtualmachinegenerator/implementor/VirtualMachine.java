package com.gigi_g.virtualmachinegenerator.implementor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VirtualMachine implements IVirtualMachine {

    @Override
    public void generateMachines(String command) {
        try {
            Process process = processBuilder.start();
        
            StringBuilder output = new StringBuilder();
        
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }
        
            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success!");
                System.out.println(command);
                System.out.println(output);
            } else {
                //abnormal....
            }
        
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}