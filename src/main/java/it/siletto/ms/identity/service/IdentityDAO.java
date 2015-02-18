package it.siletto.ms.identity.service;

import it.siletto.ms.identity.model.Identity;

public interface IdentityDAO {

	public Identity getUser(String username, String password, String realm);
}
