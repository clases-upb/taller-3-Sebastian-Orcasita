/*
 * This source file was generated by the Gradle 'init' task
 */
package taller3;

public class App {

   public static void main(String[] args) {
   

   }

   /*
    * 1. Construya un algoritmo e implemente la función en Java Escribir_asc que
    * reciba tres números enteros diferentes
    * y devuelva en un String en orden ascendente con el siguiente formato:
    * "##### - ##### - #####", donde el primero es
    * el mayor de todos, el segundo el del medio, el tercero el menor de todos. Si
    * hay al menos dos números iguales,
    * devolverá el mensaje: "Error: La función no considera números iguales". Si
    * hay un error inesperado, deberá mostrar
    * el mensaje: "Ocurrió un error inesperado".
    */

   public static String Escribir_asc(int n1, int n2, int n3){

      try {
       
         String resultado = "";
         int nMax = 0, nMin = 0, nMedio = 0; 

         if(n1 == n2 || n2 == n3 || n3 == n1)
            return "Error: La función no considera números iguales";
         

         if (n1 > n2 && n1 > n3) {
            nMax = n1;
            if (n2 > n3) {
                nMedio = n2;
                nMin = n3;
            } else {
                nMedio = n3;
                nMin = n2;
            }
         } 
         else if (n2 > n1 && n2 > n3) {
            nMax = n2;
            if (n1 > n3) {
                nMedio = n1;
                nMin = n3;
            } else {
                nMedio = n3;
                nMin = n1;
            }
         } 
         else {
            nMax = n3;
            if (n1 > n2) {
                nMedio = n1;
                nMin = n2;
            } else {
                nMedio = n2;
                nMin = n1;
            }
        }

        resultado = nMax + " - " + nMedio + " - " + nMin;
        return resultado;

      } 
      
      catch (Exception e) {
         return "Ocurrió un error inesperado \n"  + e;
      }

   }

   /*
    * 2. Construya un algoritmo e implemente la función en Java Obtener_cifras que
    * recibe un número entre 0 y 50.000
    * y devuelve byte con las cifras que tiene. Por ejemplo 10 tiene dos cifras,
    * 9999 tiene 4 cifras. Si el número
    * no está en el rango devuelve 0. Y si hay un error inesperado, devuelve -1.
    * 
    */

   public static byte Obtener_cifras(int num){

      try {
       
         byte resultado = 0;
         final int min = 0, k_diez = 10, k_cien = 100, k_mil = 1000, k_diezmil = 10000, max = 50000;

         if(num < min || num > max)
            return 0; 

         if(num < k_diez)
            resultado = 1;
         else if(num < k_cien)
            resultado = 2;
         else if(num < k_mil)
            resultado = 3;
         else if(num < k_diezmil)
            resultado = 4;
         else
            resultado = 5;

         return resultado;

      } 
      
      catch (Exception e) {
         return -1;
      }

   }

   /*
    * 3. Construya un algoritmo e implemente la función en Java Clasificar_char que
    * recibe un caracter, y
    * devuelve un string de acuerdo con las siguientes condiciones: si es un
    * alfabético, deuvelve "ES LETRA";
    * si es numérico, devuelve "ES NUMERO" o si es un carácter especial, devuelve
    * "ESPECIAL".
    * Los caracteres se validan de acuerdo con la tabla ascii básica y lo explicado
    * en clase.
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
    */

   public static String Clasificar_char(char var){

      try {
         
         final char letra_A = 'A', letra_Z = 'Z', letra_a = 'a', letra_z = 'z'
         , num_cero = '0', num_nueve = '9';

         if((var >= letra_A && var <= letra_Z) || (var >= letra_a && var <= letra_z))
            return "ES LETRA";
         else if((var >= num_cero && var <= num_nueve))
            return "ES NUMERO";
         else
            return "ESPECIAL";

      } 
      
      catch (Exception e) {
         return "Ocurrió un error inesperado \n" + e;
      }

   }

   /*
    * 
    * 4. Construya un algoritmo e implemente la función en Java
    * Hallar_division_exacta que pida dos números enteros,
    * calcule la división del primero sobre el segundo, y al final si la división
    * es exacta, devuelva "DIVISION EXACTA"
    * y de lo contrario devuelva "DIVISION NO EXACTA". (Exacta significa que tiene
    * cociente, pero no residuo).
    * 
    * Si alguno de los dos números que recibe es cero o negativo, devuelva
    * "NO SE ADMITE CERO O NEGATIVOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * Nota: Revise el funcionamiento del operador mod que le puede ayudar.
    * 
    * 
    * 
    */

   public static String Hallar_division_exacta(int var1, int var2){

      try {
         
         final byte k_cero = 0;
         String resultado = "";
         int residuo = 0;

         if(var1 <= k_cero || var2 <= k_cero)
            return "NO SE ADMITE CERO O NEGATIVOS";

         residuo = var1 % var2;

         if(residuo != k_cero)
            resultado = "DIVISION NO EXACTA";
         else
            resultado = "DIVISION EXACTA";

         return resultado;

      } 
      
      catch (Exception e) {
         return "Ocurrió un error inesperado";
      }

   }

   /*
    * 5. En la siguiente tabla se encuentra la información de las habitaciones de
    * una finca hotel:
    * 
    * Habitación Camas Planta    AA/VENTILADOR
    *    101         2     Primera     AA
    *    102         1     Primera     VE
    *    201         3     Segunda     AA
    *    202         2     Segunda     VE
    *    301         2     Tercera     AA
    * 
    * 
    * Construya un algoritmo e implemente la función en Java Consultar_hab que
    * reciba en un byte el número de camas
    * y en un string si desea VE o AA, y deuvelva en un texto el o los números de
    * habitación que cumplen ese requisito.
    * Si son varias habitaciones, devuelvalas separadas por el caracter |
    * (normalmente, al lado izquierdo de la tecla del 1).
    * Ejemplo: "101|301"
    * Si el número de camas no está entre 1 y 3 o el string es diferente a AA o VE,
    * devuelva "DATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    */

   public static String Consultar_hab(byte nro_camas, String clase){

      try {
         
         final byte min_camas = 1, max_camas = 3;
         String resultado = "";

         if(nro_camas < min_camas || nro_camas > max_camas || (!clase.equals("AA") && !clase.equals("VE")))
            return "DATOS NO VÁLIDOS";

         switch (nro_camas) {
            case 1:
               if(clase.equals("VE"))
                  resultado = "102";
               break;
            case 2:
               switch (clase) {
                  case "AA":
                     resultado = "101|301";
                     break;
                  case "VE":
                     resultado = "202";
                     break;
                  }
               break;
            case 3:
               if(clase.equals("AA"))
                  resultado = "201";
               break;
         }

         return resultado;

      } 
      
      catch (Exception e) {
         return "Ocurrió un error inesperado";
      }

   }
   
   /*
    * 
    * 6. Un restaurante vende 3 platos. Si el cliente solicita el plato 1, le dan
    * el postre gratis; si selecciona los platos
    * 1 y 2, le dan la bebida gratis y si selecciona los platos 1,2 y 3, le dan
    * postre y bebida.
    * Construya un algoritmo e implemente la función Obtener_obs en Java que reciba
    * 3 booleanos, uno para cada plato y en
    * un String devuelva el obsequio ganado en mayúscula, así: "BEBIDA", "POSTRE",
    * "BEBIDA Y POSTRE".
    * Si los 3 platos vienen en false, , devuelva "PLATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    */

   public static String Obtener_obs(boolean p1, boolean p2, boolean p3){

      try {

         String msg_final = "";

         if(p1 == true && p2 == false && p3 == false)
            msg_final = "POSTRE";
         else if(p1 == true && p2 == true && p3 == false)
            msg_final = "BEBIDA";
         else if(p1 == true && p2 == true && p3 == true)
            msg_final = "BEBIDA Y POSTRE";
         else
            msg_final = "PLATOS NO VÁLIDOS";

         return msg_final;
         
      } 
      
      catch (Exception e) {
         return "Ocurrió un error inesperado";
      }

   }

   /*
    * 7. Un grupo de amigos hace un sorteo semanalmente con pelotas de ping pong,
    * para saber quién invita y a qué  la próxima salida.
    * Las opciones dependen del color que sacan en cada bola y son:
    * 
    * verde: Invita a las cervezas
    * azul: Invita a la pizza
    * rojo: Invita al postre
    * amarillo: Paga el parqueadero de todos
    * blanco o negro: Vaya y disfrute
    * Si la función recibe algo diferente a los colores dados, debe retornar
    * "Error en el color".
    * 
    * Se necesita una función en java Conocer_invitacion que reciba un string con
    * el color de la bola y retorna un
    * String con exactamente el texto de la invitación correspondiente.
    * 
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
    */
   
   public static String Conocer_invitacion(String color){

      try {
       
         String msg_final = "";

         switch (color) {
            case "verde":
               msg_final = "Invita a las cervezas";
               break;
            case "azul":
               msg_final = "Invita a la pizza";
               break;
            case "rojo":
               msg_final = "Invita al postre";
               break;
            case "amarillo":
               msg_final = "Paga el parqueadero de todos";
               break;
            case "blanco":
               msg_final = "Vaya y disfrute";
               break;
            case "negro":
               msg_final = "Vaya y disfrute";
               break;
            default:
               msg_final = "Error en el color";
               break;
         }

         return msg_final;

      } 
      
      catch (Exception e) {
         return "Ocurrió un error inesperado";
      }

   }

}
