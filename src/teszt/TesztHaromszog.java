/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teszt;

import main.Haromszog;

public class TesztHaromszog {
    
    
    public static void main(String[] args) {
        new TesztHaromszog().tesztesetek();
    }

    private void tesztesetek() {
        oladlakAdataiteszt();
    }

    private void oladlakAdataiteszt() {
        System.out.println("Haromszog tesztek:");
        
        System.out.println("");
        Haromszog h = new Haromszog(1,1,1);
        assert h.szerkesztheto() : "Szerkezthetőségi hiba";
        
    }
}
