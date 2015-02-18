package it.siletto.ms.identity.service.impl;

import it.siletto.ms.identity.model.Identity;
import it.siletto.ms.identity.service.IdentityDAO;

import java.util.Set;

import com.google.common.collect.Sets;

public class IdentityDAOMockImpl implements IdentityDAO {

	@Override
	public Identity getUser(String username, String password, String realm) {
		Identity ret = null;
		if("pippo".equals(username) && "pluto".equals(password) && "test".equals(realm)){
			ret = new Identity();
			ret.setUsername(username);
			Set<String> roles = Sets.newHashSet();
			roles.add("user");
			ret.setRoles(roles);
		}
		return ret;
	}

}
