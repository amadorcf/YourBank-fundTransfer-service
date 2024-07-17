package amadorcf.es.YourBank_fundTransfer_service.exception;

public class InsufficientBalance extends GlobalException{
    public InsufficientBalance(String errorCode, String message) {
        super(errorCode, message);
    }
}
