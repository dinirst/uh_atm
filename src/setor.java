/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diniristanti
 */
class setor {
    
     private int saldo;
    public void menabung(int bal, int s) {
        if (s%100!=0) 
            javax.swing.JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \nSilahkan ulangi kembali","Transaksi Gagal",0);
             else
            if(s<50000)
                javax.swing.JOptionPane.showMessageDialog(null,"Besaran minimal setor tunai adalah Rp 50000,00","ERROR", 0);
    
        else
          if(s>=50000){
            saldo = bal + s;
            javax.swing.JOptionPane.showMessageDialog(null,"Saldo anda saat ini sebesar : "+saldo);
    }}
    

    int getsaldo() {
       return saldo;
    }
    
}
