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
class Televisi {
    private String deskripsi;
    private int jumlahChannel;
    private String[] channel = null;
    private int channelAktif;
    private int volume;
    
    public Televisi (String deskripsi, int jumlahChannel){
        this.deskripsi = deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
        public String getDeskripsi(){
            return deskripsi;   
        }
        public int getjumlahChannel(){
            return jumlahChannel;
        }
        public String [] getchannel(){
            if (channel == null){
            System.out.println("Belum ada channel yang diset!");
        }
        return channel;
        }
        public void setchannel(String[] channel){
            if (channel.length > jumlahChannel){
                System.out.println("Maaf Tv ini hanya dapat menyimpan " + jumlahChannel + " channel ");
            }else {
                this.channel = channel;
                System.out.println("Informasi channel berhasil diupdate!");
            }
        }
        public int getchannelAktif(){
            return channelAktif;
        }
        public void setchannelAktif (int channelAktif){
            if (channelAktif > channel.length){
                System.out.println("Channel yang Anda inginkan belum diset");
                return;
            }
            this.channelAktif = channelAktif;
            System.out.println("Pindah channel ke : " + channel[channelAktif]);
        }
        public int getvolume(){
            return volume;
        }
        public void setvolume(int volume){
            this.volume = volume;
            System.out.println("Intensitas volume sekarang : " + volume);
        }

  }
 

