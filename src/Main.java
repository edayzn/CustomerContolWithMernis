import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Eda");
		customer.setLastName("Yazan Ayan");
		customer.setNationalityId("***");
		customer.setYearOfBirth(1994);
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(customer);

		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(customer);

	}
}