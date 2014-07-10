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

import br.com.parks.trapgroup.TrapGroup;

public class TrapGroupServiceImpl implements TrapGroupService {
	static final String FILENAME = "groups.txt";

	@Override
	public void addGroup(TrapGroup group) {
		List<TrapGroup> groups = getGroups();

		group.setId(checkGroupId(groups));

		try {
			FileOutputStream fos = new FileOutputStream(getGroupFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			groups.add(group);
			oos.writeObject(groups);
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public List<TrapGroup> getGroups() {
		List<TrapGroup> groups;

		File file;
		FileInputStream fis;
		ObjectInputStream ois = null;

		try {
			file = getGroupFile();
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			groups = (List<TrapGroup>) ois.readObject();
			ois.close();

		} catch (Exception e) {
			groups = new ArrayList<TrapGroup>();
		}

		return groups;
	}

	@Override
	public File getGroupFile() {
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

	private long checkGroupId(List<TrapGroup> groups) {
		long id = new Random().nextLong();

		for (int i = 0; i < groups.size(); i++) {
			TrapGroup group = groups.get(i);
			if (group.getId() == id) {
				i = 0;
				id = new Random().nextLong();
			}
		}

		return id;
	}

	@SuppressWarnings("unchecked")
	public long getIdByName(String name) {
		List<TrapGroup> groups = getGroups();
		File file;
		FileInputStream fis;
		ObjectInputStream ois = null;

		try {
			file = getGroupFile();
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			groups = (List<TrapGroup>) ois.readObject();
			ois.close();
			for (TrapGroup group : groups) {
				if (group.getName().equals(name))
					return group.getId();
			}

		} catch (Exception e) {
			return -1;
		}

		return -1;
	}

	@SuppressWarnings("unchecked")
	public TrapGroup getGroupById(long id) {
		List<TrapGroup> groups = getGroups();
		File file;
		FileInputStream fis;
		ObjectInputStream ois = null;

		try {
			file = getGroupFile();
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			groups = (List<TrapGroup>) ois.readObject();
			ois.close();
			for (TrapGroup group : groups) {
				if (group.getId() == id)
					return group;
			}

		} catch (Exception e) {
			return null;
		}

		return null;
	}

	@Override
	public void editGroup(TrapGroup group) {
		System.out.println(group.getId());
		List<TrapGroup> groups = getGroups();
		for (Iterator<TrapGroup> iter = groups.iterator(); iter.hasNext();) {
			TrapGroup g = iter.next();
			if (g.getId() == group.getId()) {
				System.out.println("achouuu");
				g.setName(group.getName());
			}
		}

		try {
			FileOutputStream fos = new FileOutputStream(getGroupFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(groups);
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeGroup(TrapGroup group) {
		List<TrapGroup> groups = getGroups();
		for (Iterator<TrapGroup> iter = groups.iterator(); iter.hasNext();) {
			TrapGroup t = iter.next();
			if (t.getId() == group.getId())
				iter.remove();
		}

		try {
			FileOutputStream fos = new FileOutputStream(getGroupFile());
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(groups);
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
