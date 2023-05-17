package homework0517;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class StringGame implements Game {
    public String[] words = {"Orange", "Game", "Phone", "Smart"};
    public String select;
    public List<Character> charAt;

    public StringGame() {
        select = getRandomWord();
        charAt = new ArrayList<>();
    }

    public String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    }

    public void setcharAt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("한 문자를 입력하세요 : ");
        char c = sc.next().charAt(0);

        charAt.add(c);
        if (select.contains(String.valueOf(c))) {
            System.out.println("정답에 포함된 문자입니다!");
        } else {
            System.out.println("정답에 포함되지 않은 문자입니다.");
        }
    }

    public void setStrData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어를 입력하세요 : ");
        String input = sc.next();

        charAt.addAll(convertStringToList(input));
        if (input.equals(select)) {
            System.out.println("정답입니다!");
        } else {
            System.out.println("오답입니다.");
        }
    }

    public List<Character> convertStringToList(String input) {
        List<Character> characters = new ArrayList<>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }
        return characters;
    }

    public void showcharAt() {
        System.out.print("입력 내역 : ");
        for (char c : charAt) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public void init() {
        select = getRandomWord();
        charAt.clear();
        System.out.println("새 게임을 시작합니다.");
    }

	@Override
	public void setCharData() {

		
	}

	@Override
	public void showCharData() {

		
	}
}
