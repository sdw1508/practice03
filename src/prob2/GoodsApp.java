package prob2;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		/*
		 * String name="콜라 1000 10"; String[] splitData = name.split(" "); Goods goods
		 * =new Goods(); goods.setName(splitData[0]);
		 * goods.setPrice(Integer.parseInt(splitData[1]));
		 * goods.setNum(Integer.parseInt(splitData[2]));
		 * System.out.println(goods.toString());
		 */

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Goods[] goods = new Goods[n];
		scanner.nextLine();

		for (int i = 0; i < n; i++) {
			String[] lineData = scanner.nextLine().split(" ");
			goods[i] = new Goods();
			goods[i].setName(lineData[0]);
			goods[i].setNum(Integer.parseInt(lineData[1]));
			goods[i].setPrice(Integer.parseInt(lineData[2]));
		}

		for (int i = 0; i < n; i++) {
			System.out.println(goods[i].toString());
		}

		scanner.close();
		
		//배열은 항상 값이 들어가 있어야해!!!
	}
}
