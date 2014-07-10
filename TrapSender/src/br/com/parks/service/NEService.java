package br.com.parks.service;

import java.io.File;
import java.util.List;

import br.com.parks.ne.Ne;

public interface NEService {
	void addNE(Ne ne);

	List<Ne> getNes();

	File getNeFile();

	void removeNe(Ne ne);

	void editNe(Ne ne);

	void saveNes(List<Ne> nes);
}
