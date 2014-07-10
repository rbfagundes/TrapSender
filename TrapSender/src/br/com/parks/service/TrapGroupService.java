package br.com.parks.service;

import java.io.File;
import java.util.List;

import br.com.parks.trapgroup.TrapGroup;

public interface TrapGroupService {
	void addGroup(TrapGroup group);

	List<TrapGroup> getGroups();

	File getGroupFile();

	long getIdByName(String name);

	TrapGroup getGroupById(long id);

	void editGroup(TrapGroup group);

	void removeGroup(TrapGroup group);
}
