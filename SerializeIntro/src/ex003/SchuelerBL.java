/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex003;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author franz
 */
public class SchuelerBL {
    private ArrayList<Schueler> klasse = new ArrayList<>();
    
    
    public void add(Schueler s)
    {
        klasse.add(s);
    }
    public void save(File f)
    {
        
    }
    public void load(File f)
    {
        
    }
}
