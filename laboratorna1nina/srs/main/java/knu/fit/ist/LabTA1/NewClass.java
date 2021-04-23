/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.LabTA1;

/**
 *
 * @author Администратор
 */
public class NewClass {
    
    private int val;

    public NewClass() {
    }

    public NewClass(int val) {
        this.val = val;
    }

    public int getVal() {
        return 10;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "NewClass{" + "val=" + val + '}';
    
    }
}
