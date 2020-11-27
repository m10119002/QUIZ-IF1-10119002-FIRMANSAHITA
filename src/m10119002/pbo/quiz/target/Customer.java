/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.quiz.target;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Class : Class untuk Customer
 * other class
 * 
 */
public class Customer extends ServicePrice implements CustomerInvoice {
    private String name, email;
    private boolean member;
    
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return this.email;}
    public void setEmail(String email) {this.email = email;}
    public boolean isMember() {return member;}
    public void setMember(boolean member) {this.member = member;}
    // ketentuan a
    public String currentTime() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, d MMM yyyy HH:mm:ss");
        String hasil = sdf.format(date);
        String namaHari = new SimpleDateFormat("EEEE").format(date).toLowerCase();
        switch (namaHari) {
            case "monday":
                hasil = hasil.replace("Monday", "Senin");
                break;
            case "tuesday":
                hasil = hasil.replace("Tuesday", "Selasa");
                break;
            case "wednesday":
                hasil = hasil.replace("Wednesday", "Rabu");
                break;
            case "thursday":
                hasil = hasil.replace("Thursday", "Kamis");
                break;
            case "friday":
                hasil = hasil.replace("Friday", "Jum'at");
                break;
            case "saturday":
                hasil = hasil.replace("Saturday", "Sabtu");
                break;
            case "sunday":
                hasil = hasil.replace("Sunday", "Minggu");
                break;
            default:
                // do nothing
                break;
        }
        String namaBulan = new SimpleDateFormat("MMMM").format(date).toLowerCase();
        switch (namaBulan) {
            case "january":
                hasil = hasil.replace("January", "Jan");
                break;
            case "february":
                hasil = hasil.replace("February", "Feb");
                break;
            case "march":
                hasil = hasil.replace("March", "Mar");
                break;
            case "april":
                hasil = hasil.replace("April", "Apr");
                break;
            case "may":
                hasil = hasil.replace("May", "Mei");
                break;
            case "june":
                hasil = hasil.replace("June", "Jun");
                break;
            case "july":
                hasil = hasil.replace("July", "Jul");
                break;
            case "august":
                hasil = hasil.replace("August", "Agu");
                break;
            case "september":
                hasil = hasil.replace("September", "Sept");
                break;
            case "october":
                hasil = hasil.replace("October", "Oct");
                break;
            case "november":
                hasil = hasil.replace("November", "Nov");
                break;
            case "december":
                hasil = hasil.replace("December", "Des");
                break;
            default:
                // do nothing
                break;
        }
        
        return hasil;
    }
}
