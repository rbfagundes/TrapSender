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
import java.util.Random;

import br.com.parks.trap.Trap;

public class TrapServiceImpl implements TrapService {

	static final String FILENAME = "traps.txt";

	@Override
	public void addTrap(Trap trap) {
		List<Trap> traps = getTraps();

		trap.setId(checkTrapId(traps));

		try {
			FileOutputStream fos = new FileOutputStream(getTrapFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			traps.add(trap);
			oos.writeObject(traps);
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private long checkTrapId(List<Trap> traps) {
		long id = new Random().nextLong();

		for (int i = 0; i < traps.size(); i++) {
			Trap trap = traps.get(i);
			if (trap.getId() == id) {
				i = 0;
				id = new Random().nextLong();
			}
		}

		return id;
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
			if (t.getId() == trap.getId())
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
			if (t.getId() == trap.getId()) {
				t.setName(trap.getName());
				t.setComunity(trap.getComunity());
				t.setVarbinds(trap.getVarbinds());
				t.setGroupId(trap.getGroupId());
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

	@SuppressWarnings("unchecked")
	public List<Trap> getTrapsByGroup(long groupId) {
		List<Trap> allTraps;
		List<Trap> traps = new ArrayList<Trap>();

		File file;
		FileInputStream fis;
		ObjectInputStream ois = null;

		try {
			file = getTrapFile();
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			allTraps = (List<Trap>) ois.readObject();
			for (Trap trap : allTraps) {
				if (trap.getGroupId() == groupId)
					traps.add(trap);
			}
			ois.close();

		} catch (Exception e) {
			traps = new ArrayList<Trap>();
		}

		return traps;
	}

	public void removeTrapsByGroupId(long groupId) {
		List<Trap> traps = getTraps();
		for (Iterator<Trap> iter = traps.iterator(); iter.hasNext();) {
			Trap t = iter.next();
			if (t.getGroupId() == groupId)
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
}
