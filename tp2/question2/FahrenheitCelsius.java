package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       for(String s: args){
            try{
               int fahrenheit = Integer.parseInt(s);
               float celsius = fahrenheitEnCelsius(fahrenheit);
               System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); 
            }catch(NumberFormatException nfe){
               System.out.println("error : " + nfe.getMessage());  
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       float c = ((float)5/9) * (f-32);
        return (float)(((int)(c*10))/10.0);
     }

}
