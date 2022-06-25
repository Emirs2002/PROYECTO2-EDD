/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author ERodríguez
 * @version 24/06/2022
 */
public class Resumen {
    
    private String titulo;
    private String autor;
    private String cuerpo;
    private String palabraClave;
    private int numElementos;  //número de elementos que posee la tabla
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getPalabraClave() {
        return palabraClave;
    }

    public void setPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }
    
    
    
    // CONSTRUCTOR \\
    
    public Resumen(String dir){
        asignar(dir);
    }
    
    public void asignar(String path)                
    {
        
        File file = new File(path);
        String bfread;
        String temp = "";
        String[] tempSplit;
       
        int cont = 0;
        
        try
        {
            FileReader fr = new FileReader(file);
            

            BufferedReader br = new BufferedReader(fr);
           

            while((bfread = br.readLine()) != null)
            {
                if(!bfread.equals("")){
                    temp += bfread + "//";   
                }
            }
            
            br.close();
            
            tempSplit = temp.split("//");
            
           
            // ASIGNAR TITULO \\
            
            this.setTitulo(tempSplit[0]);
            
           
            // ASIGNAR AUTORES \\
            
            while(cont < tempSplit.length){
                if(tempSplit[cont].equals("Resumen")){
                    break;
                }
                cont++;                    
            }
            
            String aux = "";
            for (int i = 2; i < cont; i++) 
            {
                if(i == cont-1)
                {
                    aux += tempSplit[i];
                    
                }
                else
                {
                    aux += tempSplit[i] + ",";
                }
                
            }
            
            this.setAutor(aux);
            
            
            // ASIGNAR RESUMEN \\
                
            this.setCuerpo(tempSplit[cont+1]);
            
            
            // ASIGNAR PALABRAS CLAVE \\
                
            String palabra = tempSplit[cont+2];
            
            if(palabra.contains("Palabras Claves:")){
                String replace = palabra.replace("Palabras Claves:", "");
                this.setPalabraClave(replace);
            }else if(palabra.contains("Palabras claves:")){
                String replace = palabra.replace("Palabras claves:", "");
                this.setPalabraClave(replace);
            }
            
 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
