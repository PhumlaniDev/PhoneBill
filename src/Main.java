public class Main {

    public static void main(String[] args) {

        PhoneBill phoneBill = new PhoneBill();

        System.out.println("---------------Data Bundle---------------");
        System.out.println();

        DataBundle dataBundle = new DataBundle(1000);
        phoneBill.accept(dataBundle);
        System.out.println(phoneBill.totalCost());

        System.out.println();
        System.out.println("---------------SMS Bundle---------------");
        System.out.println();


        SMSBundle smsBundle = new SMSBundle(50,1.50);
        phoneBill.accept(smsBundle);
        System.out.println(phoneBill.totalCost());
        System.out.println();
        System.out.println("---------------Call Bundle---------------");
        System.out.println();

        PhoneCall phoneCall = new PhoneCall(225.75);
        phoneBill.accept(phoneCall);
        System.out.println(phoneBill.totalCost());

    }
}
