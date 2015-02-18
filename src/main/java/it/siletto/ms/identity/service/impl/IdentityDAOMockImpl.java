package it.siletto.ms.identity.service.impl;

import it.siletto.ms.identity.model.Identity;
import it.siletto.ms.identity.model.Profile;
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

	@Override
	public Profile getProfile(String username, String password, String realm) {
		Profile ret = null;
		if("pippo".equals(username) && "pluto".equals(password) && "test".equals(realm)){
			ret = new Profile();
			ret.setUsername(username);
			Set<String> roles = Sets.newHashSet();
			roles.add("user");
			ret.setRoles(roles);
			Set<String> permissions = Sets.newHashSet();
			permissions.add("action1.execute");
			permissions.add("action2.execute");
			permissions.add("menu1.view");
			ret.setPermissions(permissions);
		}
		return ret;
	}
}
