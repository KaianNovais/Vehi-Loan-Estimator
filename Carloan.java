public class Carloan {
    public static void main(String[] args) {

        //define o preço do carro
        int carLoan = 10000;
        //define a quantidade de anos do financiamento
        int loanLength = 3;
        //define os juros
        int interestRate = 5;
        //define a entrada
        int downPayment = 2000;
    
        if(loanLength <= 0 || interestRate <=0){
          System.out.println("Não é possível fazer o financiamento");
        } else if (downPayment > carLoan){
          System.out.println("Entrada maior que o preço do carro");
        } else {
          int remainingBalance = carLoan - downPayment;
          int months = loanLength * 12;
          int monthlyBalance = remainingBalance / months;
          int interest = monthlyBalance * interestRate / 100;
          int monthlyPayment = monthlyBalance + interest;
          System.out.println(monthlyPayment);
        }
        
    
        }
}
