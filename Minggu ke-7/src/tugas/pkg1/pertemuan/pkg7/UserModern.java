/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg1.pertemuan.pkg7;

/**
 *
 * @author ASUSPC
 */
public class UserModern {
    public static void main (String[] args){
        TelevisiModern tv = new TelevisiModern ("TV Modern, 29 inches", 100);
        String [] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV", 
                                  "METRO TV", "TRANS TV", "TPI", "TV 7", 
                                  "TVRI", "TV G", "ANTV"};
    
        System.out.println ("Pak Lukman, membeli Televisi : " + tv.getDeskripsi());
        
        tv.getchannel();
        tv.setchannel(semuaChannel);
        
        tv.setchannelAktif(3);
        tv.setvolume(10);
        tv.setchannelAktif(10);
        tv.setchannelAktif(1);
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.TV);
        tv.playCD();
        tv.setDiscTray("The Matrix");
        tv.playCD();   
    }
}

    

