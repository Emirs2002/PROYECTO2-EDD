

/**
 *
 * @author ERodríguez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Interfaz ventana = new Interfaz();
        ventana.setVisible(true);
    }
}
//
//        Resumen res1 = new Resumen("test\\Resumen1.txt");
//        Resumen res2 = new Resumen("test\\Resumen2.txt");
//        Resumen res3 = new Resumen("test\\Resumen3.txt");
//        Resumen res4 = new Resumen("test\\Resumen4.txt");
//        Lista lista = res1.getPalabraClave();
//       
//        String texto = res1.getCuerpo();
//        String textof = texto.toLowerCase();
//        int cont = 0;
//        for (int i = 0; i<lista.getTamanho(); i++){
//            textof.replace("/", "").replace(".", "");
//            String palabras = (String) lista.getNodo(i).getData();
//            System.out.println(palabras);
//            boolean encontro = textof.contains((palabras.toLowerCase().replace(".", "")));
//            if(encontro == true){
//                    cont ++;
//                }
//            
//            System.out.println(cont);
//        }
//      
        //metodo que mejor ha servido
//        Lista lista = res1.getPalabraClave();
//        Nodo temp = lista.getPfirst();
//        String texto = res1.getCuerpo();
//        String textof = texto.replace(".", "");
//        String[] textosplit = textof.split(" ");
//        for (int i = 0; i< lista.getTamanho(); i++ ){ 
//            int cont = 0;   
//            String key = (String) lista.getNodo(i).getData();
//            String[] keywords = key.split(" ");
//                for (int j = 0;j<textosplit.length; j++){
//                    //temp = lista.proximoNodo(temp);
//                    String cadena = "";
//                    System.out.println(keywords[j]);              
//                    for (int z = 0; z<key.length; z++){
//                        boolean same = false;
//                        if(keywords[j].equalsIgnoreCase(textosplit[z])){
//                           same = true;
//                        }
//                        if(same == true){
//                            cont ++;
//                        }
//                } 
//                }
//        System.out.println(cont); 
//        }
//        Lista lista = res3.getPalabraClave();
//        Nodo temp = lista.getPfirst();
//        String texto = res3.getCuerpo().toLowerCase();
//        String textof = texto.replaceAll("\\p{Punct}", "");
//        System.out.println(textof);
//        for (int i = 0; i< lista.getTamanho(); i++ ){ 
//            int cont = 0;   
//            //System.out.println(lista.getNodo(i).getData()); 
//            String palabraclave = (String) lista.getNodo(i).getData();
//            String palabrafinal = palabraclave.toLowerCase().replaceAll("\\p{Punct}", "");
//            System.out.println("la palabara es"+" "+palabrafinal);
//            String[] textosplit = textof.split(palabrafinal+" ");
//            cont = textosplit.length -1; 
//            System.out.println(cont);
//        }   
//
//   
//
//                for (int j = 0;j<texto.length(); j++){
//                    char caracter = texto.charAt(j);
//                    if (caracter == ' '){
//                        palabras="";
//                    }                     
//                    palabras = palabras + caracter;
//                    if (textosep.length == palabras.length() && palabras.equalsIgnoreCase(texto) ){
//                        cont ++;
//                    }
//                }
//        System.out.println(cont); 
//        }
//    }
//}
//}




    


        
        
        
//        
//        HashTable hs = new HashTable();
//        
//        hs.insertar(res1.getPalabraClave());
//        hs.insertar(res2);
//        hs.insertar(res3);
//        hs.insertar(res4);
//        
//        int index = hs.direccion(res1.getTitulo());
//        int index2 = hs.direccion(res2.getTitulo());
//        int index3 = hs.direccion(res3.getTitulo());
//        int index4 = hs.direccion(res4.getTitulo());
//        System.out.println(hs.getTabla());
//        System.out.println("El indice del resumen 1 es:" + index +" "+ res1.getTitulo());
//        System.out.println("El indice del resumen 2 es:" + index2 + res2.getTitulo());
//        System.out.println("El indice del resumen 3 es:" + index3 + res3.getTitulo());
//        System.out.println("El indice del resumen 4 es:" + index4 + res4.getTitulo());
////        
//       

        


  
    

