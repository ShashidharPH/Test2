package OOPsTest;

import OOPsTest.KYCUser;
import OOPsTest.User;

class User{
	int id;
	String username;
	String email;
	static double   walletBalance;
	static double billAmount;
	User(double walletBalance){
		 
		this.walletBalance=walletBalance;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	boolean makePayment(double billAmount){
		if(billAmount<=walletBalance) {
			walletBalance-=billAmount;
			return true;
		}
		else 
			return false;
	}
}

class KYCUser extends User{
	 private static int rewardPoint;
	  public KYCUser(double walletBalance) {
	        super(walletBalance);
	    }

	  public static  int getRewardPoint() {
		return (int) (billAmount*0.1);
	}

	public void setRewardPoint(int rewardPoint) {
		this.rewardPoint = rewardPoint;
	}
	 boolean makePayment(){
		if(makePayment()) {
			walletBalance+=billAmount*0.1;
			return true;
		}
		else 
			return false;
	}

	public static int getRewardPoints() {
		// TODO Auto-generated method stub
		return rewardPoint;
	}
}
public class Q_1 {

	public static void main(String[] args) {
		 User user1 = new User(1000);
	        EPayWallet.processPaymentByUser(user1, 700);
	        
	        KYCUser kycUser1 = new KYCUser(3000);
	        EPayWallet.processPaymentByUser(kycUser1,1000);
	    }
	}


