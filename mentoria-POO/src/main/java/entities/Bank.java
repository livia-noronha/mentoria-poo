package entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Bank {

	private String name;
	private List<Account> accounts;

}
