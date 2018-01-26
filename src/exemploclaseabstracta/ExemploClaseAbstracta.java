/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclaseabstracta;

/**
 *
 * @author agonzalezgonzalez
 */
public class ExemploClaseAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Poligonos p = new Poligonos(); Al ser abstracto no se puede instanciar
        Rectangulo r = new Rectangulo(4f,5f);
        Triangulo t = new Triangulo(4f,5f);
        r.acharArea();
        Poligonos re = new Rectangulo(3f,4f);
        
    }
    
}
