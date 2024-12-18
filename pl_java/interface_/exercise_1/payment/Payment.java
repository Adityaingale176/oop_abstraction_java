package pl_java.interface_.exercise_1.payment;

public class Payment{
    /*
    .
    .
    Rest of the payment methods
    .
    .
    */
    public void pay(int paymentType){
      Payable payment = PaymentCreater.getPaymentProvider(paymentType);
      payment.pay();
    }
  }
