/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        char car = 0;

        //Control 
        boolean control = true;

        do {

            try {

                System.out.print("Introduzca una vocal ...:");
                car = SCN.nextLine().charAt(0);

                if (car == 'A' || car == 'E' || car == 'I' || car == 'O'
                        || car == 'U') {

                    System.out.printf("Vocal seleccionada ...: %C%n", car);

                    control = false;
                    
                } else {
                    System.out.println("Vuelva a intentarlo c: ");

                }
                
            } catch (Exception e) {
                System.out.println("<--->");
                System.out.println("ERROR");
            }
        } while(control);
    }
}
