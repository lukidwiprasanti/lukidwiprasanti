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
public class TelevisiModern extends Televisi {
    public static final int TV = 0;
    
    public static final int TELETEXT = 1;
    int ModusTampilan = TV;
    int HalamanTeletext = 100;
    String DiscTray= null;
    public TelevisiModern (String deskripsi, int jumlahChannel){
        super (deskripsi, jumlahChannel);
    }
    public void setHalamanTeletext (int HalamanTeletext){
        this.HalamanTeletext = HalamanTeletext;
        System.out.println("Berpindah ke halaman teletext " + HalamanTeletext);
    }
    public void setModusTampilan (int ModusTampilan){
        switch (ModusTampilan){
            case TV:
                System.out.println("Modus tampilan : Televisi ");
                break;
            case TELETEXT:
                System.out.println("Modus tampilan : Teletext ");
                break;
        }
    }
    public String getDiscTray(){
        return DiscTray;
    }
    public void setDiscTray (String DiscTray){
        this.DiscTray = DiscTray;
    }
    public void playCD(){
        if (DiscTray == null){
            System.out.println("Tidak ada CD di dalam disc tray!");
            return;
        }
        System.out.println("Memutar file " + DiscTray);
    }
}
