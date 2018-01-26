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
public abstract class Poligonos {

    private float base;
    private float altura;

   
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Poligonos(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
public abstract void acharArea();
}
