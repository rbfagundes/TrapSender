package br.com.parks.service;

import java.io.File;
import java.util.List;

import br.com.parks.trap.Trap;

public interface TrapService {
	void addTrap(Trap trap);

	List<Trap> getTraps();

	File getTrapFile();

	void removeTrap(Trap trap);

	void editTrap(Trap trap);

	void saveTraps(List<Trap> traps);

	List<Trap> getTrapsByGroup(long groupId);

	void removeTrapsByGroupId(long groupId);
}
