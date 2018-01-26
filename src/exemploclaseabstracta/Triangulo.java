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
public class Triangulo extends Poligonos {

  
    public Triangulo(float base, float altura) {
        super(base, altura);
    }

    

    @Override
    public void acharArea() {
        System.out.println("area triangulo = "+super.getAltura()*super.getBase()/2);
    }
    
}
