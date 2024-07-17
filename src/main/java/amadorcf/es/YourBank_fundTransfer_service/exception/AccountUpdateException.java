package amadorcf.es.YourBank_fundTransfer_service.exception;

public class AccountUpdateException extends GlobalException{
    public AccountUpdateException(String errorCode, String message) {
        super(errorCode, message);
    }
}
