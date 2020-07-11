import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void data(){

        PhoneBill phoneBill = new PhoneBill();

        DataBundle dataBundle = new DataBundle(1000);
        phoneBill.accept(dataBundle);
        assertEquals(1100,phoneBill.totalCost());
    }

    @Test
    public void call(){

        PhoneBill phoneBill = new PhoneBill();

        PhoneCall phoneCall = new PhoneCall(225);
        phoneBill.accept(phoneCall);
        assertEquals(225,phoneBill.totalCost());
    }

    @Test
    public void sms(){

        PhoneBill phoneBill = new PhoneBill();

        SMSBundle smsBundle = new SMSBundle(50,1.50);
        phoneBill.accept(smsBundle);
        assertEquals(75,phoneBill.totalCost());
    }
}
