package org.list;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Question4 {

	public void quest() {

		List<Integer> l = new ArrayList<Integer>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);

		int size = l.size();
		System.out.println(size);

	}

	public void question51() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90));
		int indexOf = name.indexOf(10);
		System.out.println("Index value of 10 is : " + indexOf);

		List<Integer> name1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50));
		int indexOf1 = name1.lastIndexOf(10);
		System.out.println("Index value of 10 is : " + indexOf1);

		List<Integer> name2 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50));
		int indexOf2 = name2.indexOf(90);
		System.out.println("Index value of 10 is : " + indexOf2);

		List<Integer> name3 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50, 10));
		System.out.println(name3);
		for (int i = 0; i < name3.size(); i++) {
			if (name3.get(i).equals(10)) {
				System.out.println(i);
			}
		}

		List<Integer> name4 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50, 10));
		System.out.println(name4);
		for (int i = 0; i < name4.size(); i++) {
			if (name4.get(i).equals(70)) {
				System.out.println(i);
			} else
				break;
		}
		System.out.println("70 number is not present");
	}

	public void question61() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		Integer integer = name.get(2);
		System.out.println("Value of second index is : " + integer);
	}

	public void question62() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400, 500, 600, 700));
		Integer integer = name.get(4);
		System.out.println("Value of fourth index is : " + integer);
	}

	public void question63() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(105, 205, 305, 405, 505, 605, 705, 805));
		Integer integer = name.get(8);
		System.out.println("Value of eigth index is : " + integer);
	}

	public void question64() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(105, 205, 305, 405, 505, 605, 705, 805));
		for (int i = 0; i < name.size(); i++) {
			Integer integer = name.get(i);
			System.out.println(integer);
		}
	}

	public void question65() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(105, 205, 305, 405, 505, 605, 705, 805));
		for (Integer integer : name) {
			System.out.println(integer);
		}
	}

	public void question71() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		name.remove(2);
		System.out.println(name);
	}

	public void question72() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40));
		name.remove(10);
		System.out.println(name);
	}

	public void question73() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40));
		name.remove(name.lastIndexOf(10));
		System.out.println(name);
	}

	public void question81() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50));
		name.add(2, 5);
		System.out.println(name);
	}

	public void question82() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50));
		int lastIndexOf = name.lastIndexOf(50);
		name.add(lastIndexOf + 1, 70);
		System.out.println(name);
	}

	public void question83() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50));
		name.add(8, 80);
		System.out.println(name);
	}

	public void question84() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50));
		int lastIndexOf = name.lastIndexOf(10);
		name.add(lastIndexOf + 1, 100);
		System.out.println(name);
	}

	public void question91() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400, 500, 600, 700));
		int indexOf = name.indexOf(300);
		name.set(indexOf, 350);
		System.out.println(name);
	}

	public void question92() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50, 10));
		name.set(7, 90);
		System.out.println(name);
	}

	public void question93() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50, 30));
		for (int i = 0; i < name.size(); i++) {
			if (name.get(i).equals(10)) {
				name.set(i, 100);
			}
		}
		System.out.println(name);
	}

	public void question101() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50));
		List<Integer> name1 = new ArrayList<Integer>(Arrays.asList(30, 40, 50, 60, 80));

		if (name.size() > name1.size()) {
			for (int i = 0; i < name.size(); i++) {
				for (int j = 0; j < name1.size(); j++) {
					if (name.get(i).equals(name1.get(j))) {
						Integer integer = name.get(i);
						System.out.println(integer);
					}
				}
			}
		} else
			for (int j = 0; j < name1.size(); j++) {
				for (int i = 0; i < name.size(); i++) {
					if (name.get(j).equals(name1.get(i))) {
						Integer integer = name.get(j);
						System.out.println(integer);
					}
				}
			}

	}

	public void question102() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50));
		List<Integer> name1 = new ArrayList<Integer>(Arrays.asList(10, 20, 60, 50, 40, 70, 80, 90));

		// convert the arraylist into a set
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(name);
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.addAll(name1);

		// delete al elements of arraylist
		name.clear();
		name1.clear();

		// add element from set to arraylist
		name.addAll(set);
		name1.addAll(set1);
		System.out.println("ArrayList without duplicate elements name : " + name);
		System.out.println("ArrayList without duplicate elements name1 : " + name1);

		if (name.size() > name1.size()) {
			for (int i = 0; i < name.size(); i++) {
				for (int j = 0; j < name1.size(); j++) {
					if (name.get(i).equals(name1.get(j))) {
						Integer integer = name.get(i);
						System.out.println(integer);
					}
				}
			}
		} else {
			for (int j = 0; j < name1.size(); j++) {
				for (int i = 0; i < name.size(); i++) {
					if (name.get(i).equals(name1.get(j))) {
						Integer integer = name.get(i);
						System.out.println(integer);
					}
				}
			}
		}
	}

	public void question103() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80));
		List<Integer> name1 = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 8000));

		// convert the arraylist into a set
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(name);
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.addAll(name1);

		// delete al elements of arraylist
		name.clear();
		name1.clear();

		// add element from set to arraylist
		name.addAll(set);
		name1.addAll(set1);
		System.out.println("ArrayList without duplicate elements name : " + name);
		System.out.println("ArrayList without duplicate elements name1 : " + name1);

		if (name.size() >= name1.size()) {
			for (int i = 0; i < name.size(); i++) {
				for (int j = 0; j < name1.size(); j++) {
					if (name.get(i).equals(name1.get(j))) {
						Integer integer = name.get(i);
						System.out.println(integer);
					}
				}
			}
		} else if (name.size() < name1.size()) {
			for (int j = 0; j < name1.size(); j++) {
				for (int i = 0; i < name.size(); i++) {
					if (name.get(i).equals(name1.get(j))) {
						Integer integer = name.get(i);
						System.out.println(integer);
					}
				}
			}
		} else
			System.out.println("There are no common values");
	}

	public void question111() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50));
		List<Integer> name1 = new ArrayList<Integer>(Arrays.asList(30, 40, 50, 60, 80));

		boolean removeAll = name.removeAll(name1);
		System.out.println(removeAll);
	}

	public void question112() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50));
		List<Integer> name1 = new ArrayList<Integer>(Arrays.asList(10, 20, 60, 50, 40, 70, 80, 90));

		boolean removeAll = name.removeAll(name1);
		System.out.println(removeAll);
	}

	public void question113() {

		List<Integer> name = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80));
		List<Integer> name1 = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 8000));

		boolean removeAll = name.removeAll(name1);
		System.out.println(removeAll);
	}

	public static void main(String[] args) {

		Question4 t = new Question4();
		// t.quest();
		 t.question51();
		// t.question61();
		// t.question62();
		// t.question63();
		// t.question64();
		// t.question65();
		// t.question71();
		// t.question72();
		// t.question73();
		// t.question81();
		// t.question82();
		// t.question83();
		// t.question84();
		// t.question91();
		// t.question92();
		// t.question93();
		// t.question101();
		// t.question102();
		// t.question103();
		// t.question111();
		// t.question112();
		t.question113();
	}
}