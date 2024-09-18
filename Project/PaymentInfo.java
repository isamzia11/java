package Project;


public class PaymentInfo {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public PaymentInfo(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber == null || !isValidCardNumber(cardNumber)) {
            throw new IllegalArgumentException("Invalid card number");
        }
        this.cardNumber = cardNumber;
    }
    
    private boolean isValidCardNumber(String cardNumber) {
        int sum = 0;
        String reversedCardNumber = new StringBuilder(cardNumber).reverse().toString();
    
        for (int i = 0; i < reversedCardNumber.length(); i++) {
            int digit = Character.getNumericValue(reversedCardNumber.charAt(i));
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum += 2 * digit;
                if (digit >= 5) {
                    sum -= 9;
                }
            }
        }
    

    // Getters and Setters
    public String getCardNumber() 
    {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv)
     {
        this.cvv = cvv;
    }
}
}