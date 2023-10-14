public class EmployeeAdditionalPaymentService {
    public int calculateAdditionalPayment(GoodEmployee employee) {
       if(employee.getHours()>8){
           return (employee.getHours()-8)*50;
       }
       return 0;
    }
}
