/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package certicamara;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhon
 */
public class Calculator {
    private String numbersS;
    private int add;
    private String split;
    public Calculator(){
        this.add = 0;
        split = ";";
    }
    
    public int Add(String numbers) throws Exception{
        List<Integer> negativos = new ArrayList<>();
        String mensaje = "negatives not allowed ";
        
        this.numbersS = numbers;
        //SE OBTIENEN LOS DELIMITADORES
        List<String> delimitadores = new ArrayList<>();
        if(numbersS.startsWith("//")){
            String[] num = numbers.substring(2).split("\n");
            numbersS = num[1];
            delimitadores = delimitadores(num[0]);  
        }else{
            delimitadores.add(",");
            delimitadores.add("\n");
        }
        
        
        //se limpia el arreglo con un solo delimitador
        for(String ss : delimitadores){
            numbersS = numbersS.replace(ss, split);
        }
        
        
        add = sumar(numbersS, negativos, split);
        if(!negativos.isEmpty()){
            for(int ss: negativos){
                mensaje += ss+" ";
            } 
            throw new Exception(mensaje);
        }
        return add;
    }
    
    
    public int sumar(String numbers, List<Integer> negativos, String split){
       String[] num = numbers.split(split);
       int aux ;
       int suma= 0;
       for(String ss : num){
           if(!ss.isEmpty()){
           aux = Integer.parseInt(ss);
           //Verifica que no sean negativos
           if(aux<0){
               negativos.add(aux);
           //Verifica que sea menor que 1000
           }else if(aux<=1000){
               suma+=aux;
           }
           }
       }
       return suma;
    }
    
    
    //metodo para a partir de un string obtiene los delimitadores 
    //que van a separar los datos de los numeroes
    public List<String> delimitadores(String numbers){
        
        List<String> delimitadores = new ArrayList<>();
           
            String[] num = numbers.split("]");
            if(num.length == 0){
                delimitadores.add(numbers);
            }else{
                for(String ss : num){
                    delimitadores.add(ss.substring(1));
                }
            }        
                    
        return delimitadores;
    } 
            
            
        
        
        
}
