package br.com.parks.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.parks.trap.Trap;

public class TrapServiceImpl implements TrapService {

	static final String FILENAME = "traps.txt";

	@Override
	public void addTrap(Trap trap) {
		List<Trap> traps = getTraps();
		try {
			FileOutputStream fos = new FileOutputStream(getTrapFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			traps.add(trap);
			oos.writeObject(traps);
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println("Erro no add trap: " + e);
		}
	}

	@Override
	public File getTrapFile() {
		String local = System.getProperty("user.dir");
		File file = new File(local + "\\" + FILENAME);
		if (!file.exists()) {
			try {
				File newFile = new File(local + "\\" + FILENAME);
				newFile.createNewFile();
				return newFile;
			} catch (IOException e) {
				System.out.println("erro ao criar file: " + e);
				return null;
			}
		} else {
			return file;
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Trap> getTraps() {
		List<Trap> traps;

		File file;
		FileInputStream fis;
		ObjectInputStream ois = null;

		try {
			file = getTrapFile();
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			traps = (List<Trap>) ois.readObject();
			ois.close();

		} catch (Exception e) {
			traps = new ArrayList<Trap>();
		}

		return traps;
	}

	@Override
	public void removeTrap(Trap trap) {
		List<Trap> traps = getTraps();
		for (Iterator<Trap> iter = traps.iterator(); iter.hasNext();) {
			Trap t = iter.next();
			if (t.getOID().equals(trap.getOID()))
				iter.remove();
		}

		try {
			FileOutputStream fos = new FileOutputStream(getTrapFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(traps);
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editTrap(Trap trap) {
		List<Trap> traps = getTraps();
		for (Iterator<Trap> iter = traps.iterator(); iter.hasNext();) {
			Trap t = iter.next();
			if (t.getOID().equals(trap.getOID())) {
				t.setName(trap.getName());
				t.setComunity(trap.getComunity());
				t.setVarbinds(trap.getVarbinds());
			}
		}

		try {
			FileOutputStream fos = new FileOutputStream(getTrapFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(traps);
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveTraps(List<Trap> traps) {
		try {
			FileOutputStream fos = new FileOutputStream(getTrapFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(traps);
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
