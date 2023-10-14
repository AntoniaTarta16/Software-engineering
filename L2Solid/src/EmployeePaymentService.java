public class EmployeePaymentService {
    private EmployeeAdditionalPaymentService additionalPaymentService = null;


    public EmployeePaymentService(EmployeeAdditionalPaymentService additionalPaymentService) {
        this.additionalPaymentService = additionalPaymentService;
    }
    public int calculatePay(GoodEmployee employee) {
        switch (employee.getStatus()) {
            case "A":
                return additionalPaymentService.calculateAdditionalPayment(employee);
            case "B":
                return additionalPaymentService.calculateAdditionalPayment(employee)+100;
            default:
                return 0;
        }
    }
}
