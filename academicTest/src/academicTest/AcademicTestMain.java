package academicTest;

import view.LESSON_CHOICE;
import view.MENU_CHOICE;
import view.MenuViewer;
import view.STUDENT_CHOICE;
import view.SUBJECT_CHOICE;
import view.TRAINEE_CHOICE;

public class AcademicTestMain {

	public static void main(String[] args) {
		mainMenu();
	}

	public static void mainMenu() {
		int choiceNum = 0;
		boolean stopFlag = false; 
		while (!stopFlag) {
			try {
				//메인메뉴를 화면출력
				MenuViewer.mainMenuView();
				//키보드로 입력
				choiceNum = MenuViewer.choice.nextInt();
				//입력버퍼클리어
				MenuViewer.choice.nextLine();

				switch (choiceNum) {
				case MENU_CHOICE.SUBJECT:
					subjectMenu();
					break;
				case MENU_CHOICE.STUDENT:
					studentMenu();
					break;
				case MENU_CHOICE.LESSON:
					lessonMenu();
					break;
				case MENU_CHOICE.TRAINEE:
					traineeMenu();
					break;
				case MENU_CHOICE.EXIT:
					System.out.println("프로그램을 종료합니다.");
					stopFlag = true; 
					break;
				default:
					System.out.println("해당 메뉴 번호만 입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("\n입력에 오류가 있습니다.\n프로그램을 다시 시작하세요.");
				stopFlag = true; 
			}
		}
	}

	// 과목 메뉴
	public static void lessonMenu() throws Exception {
		int choice;

//		LessonRegisterManager lessonManager = new LessonRegisterManager(); 
		MenuViewer.lessonMenuView();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case LESSON_CHOICE.LIST:
			System.out.println("");
//			lessonManager.lessonList();
			break;
		case LESSON_CHOICE.INSERT:
			System.out.println("");
//			lessonManager.lessonRegistr();
			break;
		case LESSON_CHOICE.UPDATE:
			System.out.println("");
//			lessonManager.lessonUpdate();
			break;
		case LESSON_CHOICE.DELETE:
			System.out.println("");
//			lessonManager.lessonDelete();
			break;
		case LESSON_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

	// 학생 메뉴
	public static void studentMenu() throws Exception {
		int choice = 0;

		// StudentRegisterManager studnetManager = new StudentRegisterManager();
		MenuViewer.studentMenuView();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case STUDENT_CHOICE.INSERT:
			System.out.println("");
//			studnetManager.studnetRegistr();
			break;
		case STUDENT_CHOICE.UPDATE:
			System.out.println("");
//			studnetManager.studnetUpdate();
			break;
		case STUDENT_CHOICE.LIST:
			System.out.println("");
//			studnetManager.studnetTotalList();
			break;
		case STUDENT_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

	// 학과 메뉴
	public static void subjectMenu() throws Exception {
		int choice = 0;
		//학과정보를 curd를 위한 컨틀롤러
		// SubjectRegisterManager subjectManager = new SubjectRegisterManager();
		//학과메뉴선택 디스플레이
		MenuViewer.subjectMenuView();
		//학과메뉴입력
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case SUBJECT_CHOICE.LIST:
			System.out.println("");
			// subjectManager.subjectList();
			break;
		case SUBJECT_CHOICE.INSERT:
			System.out.println("");
			// subjectManager.subjectRegistr();
			break;
		case SUBJECT_CHOICE.UPDATE:
			System.out.println("");
			// subjectManager.subjectUpdate();
			break;
		case SUBJECT_CHOICE.DELETE:
			System.out.println("");
			// subjectManager.subjectDelete();
			break;
		case SUBJECT_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

	// 수강 신청 메뉴
	public static void traineeMenu() throws Exception {
		int choice;

		//TraineeRegisterManager traineeManager = new TraineeRegisterManager();
		MenuViewer.traineeMenuView();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case TRAINEE_CHOICE.LIST:
			System.out.println("");
			//traineeManager.traineeList();
			break;
		case TRAINEE_CHOICE.INSERT:
			System.out.println("");
			//traineeManager.traineeRegistr();
			break;
		case TRAINEE_CHOICE.UPDATE:
			System.out.println("");
			//traineeManager.traineeDelete();
			break;
		case TRAINEE_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

}// end of academicTestMain
