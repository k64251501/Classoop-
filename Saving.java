class Saving {
    int acc_id = 334;

    Saving() {
        System.out.println("hey iam wating program");
    }

    public void get_Saving() {
        System.out.println("current avalable");
    }

}

class Account extends Saving {
    int acc_id = 543;

    Account() {
        super();
        super.get_Saving();
        this.acc_id = super.acc_id;

    }

    public static void main(String[] args) {
        Account a1 = new Account();
        // Saving b1= new Account();
        System.out.println(a1.acc_id);
        // System.out.println(b1.acc_id);

    }
}
