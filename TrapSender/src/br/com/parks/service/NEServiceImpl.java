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

import br.com.parks.ne.Ne;

public class NEServiceImpl implements NEService {
	static final String FILENAME = "nes.txt";

	public void addNE(Ne ne) {
		List<Ne> nes = getNes();

		ne.setId(checkNeId(nes));

		try {
			FileOutputStream fos = new FileOutputStream(getNeFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			nes.add(ne);
			oos.writeObject(nes);
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Ne> getNes() {
		List<Ne> nes;

		File file;
		FileInputStream fis;
		ObjectInputStream ois = null;

		try {
			file = getNeFile();
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			nes = (List<Ne>) ois.readObject();
			ois.close();

		} catch (Exception e) {
			nes = new ArrayList<Ne>();
		}

		return nes;
	}

	@Override
	public File getNeFile() {
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
	public void removeNe(Ne ne) {
		List<Ne> nes = getNes();
		for (Iterator<Ne> iter = nes.iterator(); iter.hasNext();) {
			Ne n = iter.next();

			if (n.getId() == ne.getId())
				iter.remove();
		}

		try {
			FileOutputStream fos = new FileOutputStream(getNeFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(nes);
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editNe(Ne ne) {
		List<Ne> nes = getNes();
		for (Iterator<Ne> iter = nes.iterator(); iter.hasNext();) {
			Ne n = iter.next();
			if (n.getId() == ne.getId()) {
				n.setIP(ne.getIP());
				n.setPort(ne.getPort());
			}
		}

		try {
			FileOutputStream fos = new FileOutputStream(getNeFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(nes);
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private long checkNeId(List<Ne> nes) {
		long id = new Random().nextLong();

		for (int i = 0; i < nes.size(); i++) {
			Ne ne = nes.get(i);
			if (ne.getId() == id) {
				i = 0;
				id = new Random().nextLong();
			}
		}

		return id;
	}

	public void saveNes(List<Ne> nes) {
		try {
			FileOutputStream fos = new FileOutputStream(getNeFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(nes);
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
