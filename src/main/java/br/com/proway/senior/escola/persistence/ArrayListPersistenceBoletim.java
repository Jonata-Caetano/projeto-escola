package br.com.proway.senior.escola.persistence;

import java.util.ArrayList;

import br.com.proway.senior.escola.model.Boletim;

public class ArrayListPersistenceBoletim {

	public ArrayList<Boletim> dados = new ArrayList<Boletim>();

	public boolean removeAll() {
		try {
			dados.clear();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}


	public boolean remove(Integer indexBoletim) {
		try {
			dados.remove((int) indexBoletim);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	public Boletim add(Boletim item) {
		try {
			Integer id = dados.size();
			item.setId(id);
			dados.add(item);
			return item;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}


	public Boletim get(Integer indexItem) {
		try {
			return dados.get(indexItem);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public ArrayList<Boletim> getAll() {
		try {
			return dados;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
