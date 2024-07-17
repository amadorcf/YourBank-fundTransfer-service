package amadorcf.es.YourBank_fundTransfer_service.exception;

public class ResourceNotFound extends GlobalException {
    public ResourceNotFound(String errorCode, String message) {
        super(errorCode, message);
    }
}
