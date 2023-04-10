public class CreditPaymentService {
    public double calculate(int c, double p, int t) {
        double m = p / t / 100; //месячная процентная ставка
        double k = m * (Math.pow(1 + m, t)) / ((Math.pow(1 + m, t) - 1)); // коэфициент аннуитета
        double result = c * k; // расчет платежа
        return result;

    }
}