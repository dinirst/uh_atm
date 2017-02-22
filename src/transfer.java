/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diniristanti
 */
class transfer {
    
    private int saldo, str;
    
    public void transfer(int tab, int t) {
        if (t%100!=0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \nSilahkan ulangi kembali","Transaksi Gagal",0);
        }else
            if(t>tab){
                javax.swing.JOptionPane.showMessageDialog(null,"Saldo anda tidak mencukupi, silakan melakukan penyetoran","Transaksi Gagal", 0);
            }else
            if (t<50000) {
                javax.swing.JOptionPane.showMessageDialog(null,"Transfer berhasil\n Nomor rekening " +str,"Transaksi Berhsail", 0);
            }else{
                saldo=tab-t;
                javax.swing.JOptionPane.showMessageDialog(null,"Saldo anda saat ini sebesar : "+saldo);
            if(tab<=50000){
                javax.swing.JOptionPane.showMessageDialog(null, "Saldo minimal harus Rp 50000, Segara lakukan penyetoran untuk menghindari penutupan akun","CAUTION" ,0);
                        
    }}
    }

    int getsaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
