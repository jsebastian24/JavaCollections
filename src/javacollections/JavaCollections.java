
package javacollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Sebastian Pizarro ELSI449
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //ARRAYLIST CON EJEMPLOS DE EQUIPOS
        System.out.println("-.-.-ARRAYLIST CON EJEMPLOS DE EQUIPOS-.-.-\n ");
        
        List<String> equipos = new ArrayList<>();
        
        //INSERTAR ELEMENTOS
        equipos.add("rioja juniors");
        equipos.add("tesorieri");
        equipos.add("estudiantes");
        equipos.add("andino");
        equipos.add("san lorenzo");
        equipos.add("san martin");
        
        System.out.println("LISTA: "+equipos);
        
        //ELIMINAR ELEMENTOS
        equipos.remove(0);
        System.out.println("LISTA CON EL ELEMENTO DE INDICE 0 BORRADO: "+equipos);
        
        //RECORRER
        System.out.println("RECORRIDO DE LISTA: ");
        for(int i=0;i<equipos.size();i++)
        {
            System.out.println(i + "_" + equipos.get(i));
        }
        
       //ORDENAR
       equipos.sort(Comparator.naturalOrder());
        System.out.println("LISTA ORDENADA: "+equipos);
        
        //--------------------------------------------------------------------------
        // HASHSET CON EJEMPLOS DE MARCAS
        System.out.println("\n-.-.-HASHSET CON EJEMPLOS DE MARCAS-.-.-\n ");
        
        Set<String> marcas = new HashSet<>();
        
        //INSERTAR ELEMENTOS
        marcas.add("Nike");
        marcas.add("Adidas");
        marcas.add("Puma");
        marcas.add("Under Armour");
        marcas.add("Reebok");
        marcas.add("Salomon");
        marcas.add("New Balance");
        
        System.out.println("LISTA: "+marcas);
        
        //ELIMINAR ELEMENTOS
         marcas.remove("Nike");
        System.out.println("LISTA CON EL ELEMENTO DE NOMBRE NIKE BORRADO: "+marcas);
        
        //RECORRER
        System.out.println("RECORRIDO DE LISTA:");
        marcas.forEach((marc) -> {
            System.out.println(marc);
        });
        
      //--------------------------------------------------------------------------
       // HASHMAP CON EJEMPLOS DE NUMEROS
       System.out.println("\n-.-.-HASHMAP CON EJEMPLOS DE NUMEROS-.-.-\n ");
       
       Map<String, Integer> num = new HashMap<>();
        
       //INSERTAR ELEMENTOS
        num.put("Uno", 1);
        num.put("Dos", 2);
        num.put("Tres", 3);
        num.put("Cuatro", 4);
        num.put("Cinco", 5);
        num.put("Seis", 6);
        num.put("Siete", 7);
        
        System.out.println("MAPPING: "+num);
       
        //ELIMINAR ELEMENTOS
        num.remove("Uno");
        System.out.println("LISTA CON EL ELEMENTO DE NOMBRE UNO BORRADO: "+num);
        
        //RECORRER
          System.out.println("RECORRIDO EN HASHMAP: ");
        num.forEach((letra, numero)-> {
            System.out.println(letra + ";" + numero);
        });
        
        
        
    }
    
}
