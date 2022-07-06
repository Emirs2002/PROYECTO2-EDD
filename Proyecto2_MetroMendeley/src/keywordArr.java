/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alesc
 * @version 2/07/2022
 * 
 */
public class keywordArr {
    
    private String keyword;
    private String titulo;
    private Lista titulos;

    public keywordArr(String keyword, String titulo) {
        this.keyword = keyword;
        this.titulo = titulo;
    }
    
    public keywordArr(String keyword)
    {
        this.keyword = keyword;
        this.titulos = new Lista();
    }
    

    /**
     * @return the keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * @param keyword the keyword to set
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the titulos
     */
    public Lista getTitulos() {
        return titulos;
    }

    /**
     * @param titulos the titulos to set
     */
    public void setTitulos(Lista titulos) {
        this.titulos = titulos;
    }
    
    
}
