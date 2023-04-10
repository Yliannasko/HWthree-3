public class CreditPaymentService {
    public double calculate(int credit, double percentage, int loan) {
        double interestRate = (percentage / 100 )/ 12; //месячная процентная ставка
        double coefficient = interestRate * (Math.pow(1 + interestRate, loan)) / ((Math.pow(1 + interestRate, loan) - 1)); // коэфициент аннуитета
        double result = credit * coefficient; // расчет платежа
        return result;

    }
}