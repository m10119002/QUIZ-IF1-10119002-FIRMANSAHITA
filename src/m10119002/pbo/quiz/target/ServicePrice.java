/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.quiz.target;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Class : Class untuk Service Price
 * other class
 * 
 */
public class ServicePrice implements ServiceItem {
    private float priceService;
    private float discount;
    
    public float getPriceService() {return this.priceService;}
    public void setPriceService(float priceService)
    {this.priceService = priceService;}
    // ketentuan b
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
    }
    // ketentuan c
    public float getPrice(int serviceItem) {
        switch (serviceItem) {
            case 1:
                return 45000.0f;
            case 2:
                return 55000.0f;
            case 3:
                return 15000.0f;
            default:
                return 0;
        }
    }
    // ketentuan d
    public boolean checkMemberStatus(String statusMember) {
        if(statusMember.toLowerCase().equals("yes")) {
            return true;
        } else if(statusMember.toLowerCase().equals("no")) {
            return false;
        } else {
            return false;
        }
    }
    // ketentuan e
    public float getSale(boolean isMember, float parServicePrice) {
        if(isMember) {
            return parServicePrice*0.1f;
        } else {
            return parServicePrice;
        }
    }
    // ketentuan f
    public float getTotalPay(float priceService, float discount) {
        return priceService-(priceService*discount);
    }
}
