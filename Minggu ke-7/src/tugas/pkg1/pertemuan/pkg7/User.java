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
public class User {
    public static void main (String[] args){
        Televisi tv = new Televisi ("TV Tempoe Doeloe, 14 inches", 10);
        String [] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV", 
                                  "METRO TV", "TRANS TV", "TPI", "TV 7", 
                                  "TVRI", "TV G", "ANTV"};
        String [] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
                                    "METRO TV", "TRANS TV", "TPI", "TV 7"};
        System.out.println ("Pak Lukman, membeli Televisi : " + tv.getDeskripsi());
        
        tv.getchannel();
        tv.setchannel(semuaChannel);
        tv.setchannel(channelFavorit);
        
        tv.setchannelAktif(3);
        tv.setvolume(10);
        tv.setchannelAktif(10);
        tv.setchannelAktif(1);
        
    }
}
