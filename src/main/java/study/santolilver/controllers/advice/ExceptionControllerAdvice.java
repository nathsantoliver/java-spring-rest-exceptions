package study.santolilver.controllers.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import study.santolilver.exceptions.NotEnoughMoneyException;
import study.santolilver.model.ErrorDetails;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("NNot enough money to make the payment.");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }

}
