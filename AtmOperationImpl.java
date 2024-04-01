import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface{
    Atm atm = new Atm();
    Map<Double, String> ministatement = new HashMap<>();
    
    @Override
    public void wiewBalance() {

        System.out.println("Available Balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount<=atm.getBalance()){
            ministatement.put(withdrawAmount, " Ammount Withdrawn");
            System.out.println("Collect the Ammount " + withdrawAmount);
            atm.setBalance(atm.getBalance() - withdrawAmount);
            wiewBalance();
        }
        else{
            System.out.println("Insufficient Balance! ");
        }
         
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministatement.put(depositAmount, " Ammount Deposited");
        System.out.println(depositAmount + "Ammount Deposited!");
        atm.setBalance(atm.getBalance()+depositAmount);
        wiewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double, String> m:ministatement.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }

}