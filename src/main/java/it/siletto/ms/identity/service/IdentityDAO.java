package it.siletto.ms.identity.service;

import it.siletto.ms.identity.model.Identity;
import it.siletto.ms.identity.model.Profile;

public interface IdentityDAO {

	public Identity getUser(String username, String password, String realm);
	public Profile getProfile(String username, String password, String realm);
}
