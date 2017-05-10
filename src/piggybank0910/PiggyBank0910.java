/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piggybank0910;

import javax.swing.JOptionPane;

/**
 *
 * @author kms080
 */
public class PiggyBank0910 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        piggyBank pigBank = new piggyBank(1,2,3,4);
        pigBank.returnPennies();
        pigBank.returnNickels();
        pigBank.returnDimes();
        pigBank.returnQuarters();
        pigBank.returnTotal();
    }
}

class piggyBank {
    private int pennies, nickels, dimes, quarters;
    public piggyBank() {
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }
    public piggyBank(int p, int n, int d, int q) {
        pennies = p;
        nickels = n;
        dimes = d;
        quarters = q;
    }
    int returnPennies() {
        return pennies;
    }
    int returnNickels() {
        return nickels;
    }
    int returnDimes() {
        return dimes;
    }
    int returnQuarters() {
        return quarters;
    }
    void addPennies(int p) {
        pennies += p;
    }
    void addNickels(int n) {
        nickels += n;
    }
    void addDimes(int d) {
        dimes += d;
    }
    void addQuarters(int q) {
        quarters += q;
    }
    void returnTotal() {
        String total = "The total value of the coins in the pigggy bank equals " + ((quarters*25)+(dimes*10)+(nickels*5)+pennies) + " cents.";
        String amount = total;
        JOptionPane.showMessageDialog(null, amount);
    }
}
