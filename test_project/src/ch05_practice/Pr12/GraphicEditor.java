package ch05_practice.Pr12;

import java.util.Scanner;

public class GraphicEditor {

	Scanner sc;
	private Shape start;
	private Shape end;

	public GraphicEditor() {
//		super();
		start = null;
		end = null;
		sc = new Scanner(System.in);
	}

	void run() {
		System.out.println("그래픽 에디터 G-v1.0을 실행합니다.");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("입력1, 삭제2, 모두보기3, 끝내기4 >> ");
			int option = sc.nextInt();

			switch (option) {
			case 1: // 입력
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				int type = sc.nextInt();
				if (type < 1 || type > 3) {
					System.out.println("1~3사이를 입력해주세요!!!");
					break;
				}
				insert(type);

				break;
			case 2: // 삭제
				System.out.print("삭제할 도형의 위치 >> ");
				int index = sc.nextInt();
//					boolean bOk = delete(index);
				if (!delete(index)) {
					System.out.println("삭제 필요했어요!!!!");
				}

				break;
			case 3: // 모두보기
				view();
				break;

			case 4: // 끝내기

//					break;
				System.out.println("프로그램을 종료합니다!!");
				return;
			default:
				System.out.println("1~4만 입력해주세요!!!!");
			}

		} // while

	}

	private void view() {
		Shape s = start;
		while(s != null) {
			s.draw();
			s = s.getNext();
		}
	}//view

	private boolean delete(int index) {
		// 아무것도 없을 경우
		if (start == null)
			return false;

		Shape current = start;
		Shape previous = start;
		for (int i = 0; i < index; i++) {
			previous = current; // 뒤로 가기 전에 담아놓음
			current = current.getNext(); // 뒤로 이동
			
			if (current == null) {
				return false;
			}
		}

		// 한개밖에 없을 경우
		if (start == end) {
			start = null;
			end = null;
			return true;
		}
		
		//한개 이상이 들어있으면서, 첫번째 노트일때
		if(current == start) {
			start = current.getNext();
//			return true;
		}else if(current == end) {
			end = previous;
			current = current.getNext();
			end.setNext(null);
		}else {
			previous.setNext(current.getNext());
		}

		return true;

	}// delete

	private void insert(int type) {

		Shape obj = null;
		switch (type) {
		case 1:
			obj = new Line();
			break;
		case 2:
			obj = new Line();
			break;
		case 3:
			obj = new Line();
			break;
		}

		if (start == null) {
			start = obj;
			end = obj;
		} else {
			end.setNext(obj);
			end = obj;
		}
	}// insert

}
