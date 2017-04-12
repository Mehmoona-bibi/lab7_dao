/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_6_new;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author boss
 */
@Entity
@Table(name = "employee")
public class Passwords {
    @Id
    private int id;
    private String Scheme;
    private float TimeTaken,TC1,TC2,TC3,TC4,TC5,TC6,TC7;
    private boolean State, S1, S2,S3,S4,S5,S6,S7;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getScheme() {return Scheme;}
    public void setScheme(String Scheme) {this.Scheme = Scheme;}
    
    public void setTimeTaken(float TimeTaken) {this.TimeTaken=TimeTaken; }
    public float getTimeTaken(){return TimeTaken;}
    
    public void setTC1(float TC1) {this.TC1=TC1; }
    public float getTC1(){return TC1;}
}
