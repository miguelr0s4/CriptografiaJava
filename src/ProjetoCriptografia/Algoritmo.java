package ProjetoCriptografia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algoritmo {
	
    public static void main(String[] args) throws IOException {

      //Pega o arquivo
      Path caminhoArquivo = Path.of("C:\\miguelrosa\\ProjetoCriptografia\\apocalipse1.txt");
      String passagem = Files.readString(caminhoArquivo);
      System.out.println(passagem);
      
      //tira os caracteres, espa�os e letras ma�usculas
      String novaPassagem = passagem.replaceAll("[ .,-:;!]", "").toLowerCase();
      System.out.println(novaPassagem);      
      
      //troca os caracteres especiais pelos normais
      String passagemSemEspeciais = novaPassagem.replaceAll("[����]", "a")
      		.replaceAll("[��]", "e")
      		.replaceAll("[�]", "i")
      		.replaceAll("[���]", "o")
      		.replaceAll("[��]", "u")
      		.replaceAll("[�]", "c");      
      System.out.println(passagemSemEspeciais);     
      
      List<String> passagemCriptografada = criptografar(passagemSemEspeciais);
      System.out.println(passagemCriptografada+"\n");
      
      List<String> passagemDecriptografada = decriptografar(passagemCriptografada);
      System.out.println(passagemDecriptografada+"\n");

	}

    public static List<String> alterarTexto(String passagemSemEspeciais){
    	
        //dividindo a string alterada em cada letra a fim de criar um vetor 
        String[] passagemSemEspeciaisString = passagemSemEspeciais.split("");
        
        //O vetor e cria um array manipul�vel, atribuindo cada elemento (letra) a uma posi��o
        //O Arraylist determina um tamanho espec�fico da lista
        ArrayList<String> listPassagemUTF8 = new ArrayList<String>(Arrays.asList(passagemSemEspeciaisString));
        
        
        //cria um array para receber as altera��es conforme a tabela
  	  List<String> passagemUTF8 = new ArrayList<String>();

  	  //estrutura de repeti��o para percorrer todas as posi��es do array sem repeti��o
  	  for(int i=0; i < listPassagemUTF8.size(); i++){
  	      if(listPassagemUTF8.get(i).contains("a")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("a", "z")); 
  	      }else if(listPassagemUTF8.get(i).contains("b")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("b", "y")); 
  	      }else if(listPassagemUTF8.get(i).contains("c")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("c", "x")); 
  	      }else if(listPassagemUTF8.get(i).contains("d")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("d", "w")); 
  	      }else if(listPassagemUTF8.get(i).contains("e")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("e", "v")); 
  	      }else if(listPassagemUTF8.get(i).contains("f")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("f", "u")); 
  	      }else if(listPassagemUTF8.get(i).contains("g")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("g", "t")); 
  	      }else if(listPassagemUTF8.get(i).contains("h")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("h", "s")); 
  	      }else if(listPassagemUTF8.get(i).contains("i")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("i", "r")); 
  	      }else if(listPassagemUTF8.get(i).contains("j")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("j", "q")); 
  	      }else if(listPassagemUTF8.get(i).contains("k")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("k", "p")); 
  	      }else if(listPassagemUTF8.get(i).contains("l")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("l", "o")); 
  	      }else if(listPassagemUTF8.get(i).contains("m")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("m", "n")); 
  	      }else if(listPassagemUTF8.get(i).contains("n")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("n", "m")); 
  	      }else if(listPassagemUTF8.get(i).contains("o")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("o", "l")); 
  	      }else if(listPassagemUTF8.get(i).contains("p")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("p", "k")); 
  	      }else if(listPassagemUTF8.get(i).contains("q")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("q", "j")); 
  	      }else if(listPassagemUTF8.get(i).contains("r")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("r", "i")); 
  	      }else if(listPassagemUTF8.get(i).contains("s")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("s", "h")); 
  	      }else if(listPassagemUTF8.get(i).contains("t")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("t", "g")); 
  	      }else if(listPassagemUTF8.get(i).contains("u")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("u", "f")); 
  	      }else if(listPassagemUTF8.get(i).contains("v")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("v", "e")); 
  	      }else if(listPassagemUTF8.get(i).contains("w")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("w", "d")); 
  	      }else if(listPassagemUTF8.get(i).contains("x")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("x", "c"));
  	      }else if(listPassagemUTF8.get(i).contains("y")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("y", "b"));	    	  
  	      }else if(listPassagemUTF8.get(i).contains("z")){
  	    	  passagemUTF8.add(listPassagemUTF8.get(i).replace("z", "a"));	    	  
  	      }
  	  }
  	  
  	  return passagemUTF8;
     }
    

    public static List<String> criptografar(String passagemSemEspeciais){
    	
    	List<String> passagemCriptografada = alterarTexto(passagemSemEspeciais);
    	
    	return passagemCriptografada;
    }
    
    
    public static List<String> decriptografar(List<String> passagemCriptografada){
    	
    	//transformar a lista em String a fim de que possa ser utilizado o m�todo de altera��o 
    	String passagemCriptografadaString = "";
    	
    	for(String letra : passagemCriptografada) {
    		passagemCriptografadaString += letra;
    	}
    		
    	List<String> passagemDecriptografada = alterarTexto(passagemCriptografadaString);
    	
    	return passagemDecriptografada;
    }
        
}
